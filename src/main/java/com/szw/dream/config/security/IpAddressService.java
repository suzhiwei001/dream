package com.szw.dream.config.security;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.http.HttpServletRequest;
import java.net.InetAddress;
import java.net.UnknownHostException;
@Slf4j
public class IpAddressService {
    /**
     * 获取当前网络ip
     * @param request
     * @return
     */
    public static String getIpAddress(HttpServletRequest request){
        String ipAddress = request.getHeader("x-forwarded-for");
        if(ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {
            ipAddress = request.getHeader("Proxy-Client-IP");
        }
        if(ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {
            ipAddress = request.getHeader("WL-Proxy-Client-IP");
        }
        if(ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {
            ipAddress = request.getRemoteAddr();
            if(ipAddress.equals("127.0.0.1") || ipAddress.equals("0:0:0:0:0:0:0:1")){
                //根据网卡取本机配置的IP
                InetAddress inet=null;
                try {
                    inet = InetAddress.getLocalHost();
                } catch (UnknownHostException e) {
                    e.printStackTrace();
                }
                ipAddress= inet.getHostAddress();
            }
        }
        //对于通过多个代理的情况，第一个IP为客户端真实IP,多个IP按照','分割
        if(ipAddress!=null && ipAddress.length()>15){ //"***.***.***.***".length() = 15
            if(ipAddress.indexOf(",")>0){
                ipAddress = ipAddress.substring(0,ipAddress.indexOf(","));
            }
        }
        iPAll(request);
        return ipAddress;
    }

    public static void iPAll(HttpServletRequest request) {
        log.info("x-forwarded-for={}",request.getHeader("x-forwarded-for"));
        log.info("Proxy-Client-IP={}",request.getHeader("Proxy-Client-IP"));
        log.info("WL-Proxy-Client-IP={}",request.getHeader("WL-Proxy-Client-IP"));
        log.info("WL-Proxy-Client-IP={}",request.getHeader("WL-Proxy-Client-IP"));

        try {
            byte[] address = InetAddress.getLocalHost().getAddress();
            log.info("address={}",address);
            String hostAddress = InetAddress.getLocalHost().getHostAddress();
            log.info("hostAddress={}",hostAddress);
        } catch (UnknownHostException e) {
            log.error("");
        }
    }
}

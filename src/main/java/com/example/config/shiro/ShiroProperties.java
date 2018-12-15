/** * $Id: ShiroProperties.java,v 1.0 7/9/18 4:37 PM chenmin Exp $ * <p> */package com.example.config.shiro;import lombok.Data;import org.springframework.boot.context.properties.ConfigurationProperties;import java.util.List;import java.util.Map;/** * @author chenmin * @version $Id: ShiroProperties.java,v 1.1 7/9/18 4:37 PM chenmin Exp $ * Created on 7/9/18 4:37 PM */@Data@ConfigurationProperties(prefix = "security.shiro")public class ShiroProperties {    /**     * 登录Url     */    private String loginUrl;    /**     * 没权限访问时的转发Url(做未登录提示信息用)     */    private String noAccessUrl;    /**     * Shiro请求拦截规则配置(shiro的拦截器规则，常用的anon和authc)     */    private Map<String, List<String>> filter;    /**     * Shiro Session 过期时间（分钟）     */    private Long globalSessionTimeout = 30L;}
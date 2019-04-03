package com.gs.web.shiro;

import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;
 
@Slf4j
@Component
public class MyShiroRealm extends AuthorizingRealm {

	 /**
     * 验证用户权限的位置
     * 进入方法的场景：
     *  1、@RequiresRoles("admin") ,@RequiresPermissions("admin") 在方法上加注解的时候；
     *  2、subject.hasRole(“admin”) 或 subject.isPermitted(“admin”) 自己去调用这个方法
     *  3、[@shiro.hasPermission name = "admin"][/@shiro.hasPermission]： 在页面加这个标签的时候，这个项目是前后端分离，所以这个方法无效
     * @param principals
     * @return
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		
		SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        log.debug("授权");
        return authorizationInfo;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		//获取用户的输入的账号.
        String username = "admin";
        String realPassword = "admin";
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
        		username, //用户信息
        		realPassword, //密码
                ByteSource.Util.bytes(""),//salt 加密，未用到，这里就不做介绍了。
                getName() //realm name
        );
        return authenticationInfo;
	}

}

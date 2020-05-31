package com.awen.vo;

/**
 * @author : Liu Awen
 * @create : 2020-03-22
 * @describe:
 */
public class GitHubConstant {
    // 这里填写在GitHub上注册应用时候获得 CLIENT ID
//    public static final String  CLIENT_ID="Iv1.5f8c132f227f383c";
    public static final String  CLIENT_ID="648869a59dca36de3a07";
    //这里填写在GitHub上注册应用时候获得 CLIENT_SECRET
    public static final String CLIENT_SECRET="755c85b587ee2734cf59572768bdd623da0b61ea";
//    public static final String CLIENT_SECRET="1d32d8e8cf662adb4f1681eacdd02de1017b7d04";
    // 回调路径
    public static final String CALLBACK = "http://liuawen.top/github/callback";

    //获取code的url
    public static final String CODE_URL = "https://github.com/login/oauth/authorize?client_id="+CLIENT_ID+"&state=STATE&redirect_uri="+CALLBACK+"";
    //获取token的url
    public static final String TOKEN_URL = "https://github.com/login/oauth/access_token?client_id="+CLIENT_ID+"&client_secret="+CLIENT_SECRET+"&code=CODE&redirect_uri="+CALLBACK+"";
    //获取用户信息的url
    public static final String USER_INFO_URL = "https://api.github.com/user?access_token=TOKEN";

}

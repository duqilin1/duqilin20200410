package com.bawie.lianxi0409.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 *@auther:杜其林
 *@Date: 2020/4/9
 *@Time:20:25
 *@Description:${DESCRIPTION}
 * */
public interface CommitUtil {

    public static boolean isPhone(String phone){
        Pattern compile = Pattern.compile("^1[0-9]{10}$");
        Matcher matcher = compile.matcher(phone);
        boolean matches = matcher.matches();
        return matches;
    }
}

package com.ripplechan;

import lombok.Data;

/**
 * @author RippleChan
 * @date 2018-12-02
 * @time 23:54
 */
public class OOPExample {

    /**
     * 当没有面向对象思想的时候，如何存储用户信息？
     */
    public static class NoOOP{
        /**
         * 可以理解为，只能使用内置的数据类型，对于这种场景，要么就是字符串，要么就是数组了吧。
         * 用字符串的话：
         */
        String user = "1|admin|password";
        /**
         * 用数组的话：
         */
        String[] tom = {"2","tom","ueotahueoa"};
        /**
         * 结论：如果没见过面向对象，可能感觉还行。但知道由面向对象后，真的太不直观了，太不优雅了。
         */
    }

    /**
     * 有数据类型，那么就简单了，我们可以直接自定义一个类型:User
     */
    public static class HaveOOP {
        @Data
        class User {
            private Long id;
            private String userName;
            private String password;

            public void changePassword(String newPassword) {
                this.password = newPassword;
            }
        }
        /**
         * 结论：看上去优雅多了，而且也很直观，维护起来也很方便。而且可以通过增加行为的方式，屏蔽复杂性，比如：
         * com.ripplechan.OOPExample.HaveOOP.User#changePassword(java.lang.String)
         */
    }

}

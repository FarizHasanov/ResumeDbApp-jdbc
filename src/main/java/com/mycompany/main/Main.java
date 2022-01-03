package com.mycompany.main;

import com.company.dao.inter.UserDaoInter;
import com.company.dao.inter.UserSkillDaoInter;

public class Main {

    public static void main(String[] args) throws Exception {
        UserDaoInter dao = Context.instanceUserDao();
        System.out.println(dao.removeUser(6));
    }
}

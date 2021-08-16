package service;

import moduls.HomThu;

import java.util.ArrayList;

public class HomThuService {
    HomThu homThu;

    public HomThuService (){
        homThu=(new HomThu("English",25,false,"thor"));
    }
    public void save(HomThu homThu){
       this.homThu=homThu;
    }
}

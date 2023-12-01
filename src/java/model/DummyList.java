/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class DummyList {
    private ArrayList<Memorial> dummyList;

    public DummyList() {
        dummyList = new ArrayList<>();
        for(int i = 1; i < 41; i++){
            dummyList.add(new Memorial(i, i, "Vô Danh", "1/1/1966", "Hà Nội", "1/1/2000", "Hà Nội", "Hà Nội", "Ngô Quyền, còn được biết đến với tên gọi Tiền Ngô Vương là vị vua đầu tiên của nhà Ngô trong lịch sử Việt Nam. Năm 938, ông là người lãnh đạo nhân dân đánh bại quân Nam Hán trong trận Bạch Đằng, chính thức kết thúc gần một ngàn năm Bắc thuộc, mở ra một thời kì độc lập lâu dài của Việt Nam", "pic1.jpg"));
        }
    }

    public ArrayList<Memorial> getDummyList() {
        return dummyList;
    }
    
}

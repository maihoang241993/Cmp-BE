package cpm.web.dto.sales;

import cpm.web.dto.BasicParramDto;

public class MenuPictureDto extends BasicParramDto {

    private String picture_table;
    private String tname;

    public String getPicture_table() {
        return picture_table;
    }

    public void setPicture_table(String picture_table) {
        this.picture_table = picture_table;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }
}

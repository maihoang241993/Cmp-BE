package cpm.web.dto.menuNavigate;

import cpm.web.dto.BasicParramDto;

import javax.persistence.Table;

@Table(name = "tbl_menu")
public class MenuNavigateDto extends BasicParramDto {
    private String parrent;
    private String name;
    private String icon;
    private String type;
    private String screenId;

    public String getParrent() {
        return parrent;
    }

    public String getName() {
        return name;
    }

    public String getIcon() {
        return icon;
    }

    public String getType() {
        return type;
    }

    public String getScreenId() {
        return screenId;
    }

    public void setParrent(String parrent) {
        this.parrent = parrent;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setScreenId(String screenId) {
        this.screenId = screenId;
    }
}

package cpm.web.bl.sales;

import cpm.web.dto.sales.MenuPictureDto;
import cpm.web.service.execute.ExecuteQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

@Service
public class SalesTableImpl implements SalesTable {

    @Autowired
    ExecuteQueryService executeQueryService;

    @Override
    public List<?> loadMaxMenuIndexBL() {
        Map<String, String> hmParram = new TreeMap<>();
        hmParram.put("tloc_id","01");
        hmParram.put("tstyle","");
        return (List<?>) executeQueryService.executeQueryFunction("fun_select_menu_picture", hmParram,new MenuPictureDto());
    }
}

package cpm.web.bl.menu;

import cpm.web.dto.menuNavigate.MenuNavigateDto;
import cpm.web.service.execute.ExecuteQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

@Service
public class MenuNavigateImpl implements MenuNavigate {

    @Autowired
    ExecuteQueryService executeQueryService;

    @Override
    public List<?> loadDataMenu() {
        Map<String, String> hmParram = new TreeMap<>();
        hmParram.put("tloc_id","01");
        hmParram.put("tstyle","");
        return (List<?>) executeQueryService.executeQuery(hmParram,new MenuNavigateDto());
    }
}

package cpm.web.controller.menuNavigate;

import cpm.web.bl.menu.MenuNavigate;
import cpm.web.utils.ExecuteWebController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/menu")
@CrossOrigin()
public class MenuNavigateController extends ExecuteWebController {

    @Autowired
    MenuNavigate menuNavigate;

    @GetMapping(value = "/init")
    public ResponseEntity<?> init() {
        String tmp = this.convertData();
        return ResponseEntity.status(HttpStatus.OK).body(menuNavigate.loadDataMenu());

    }
}

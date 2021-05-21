package cpm.web.controller.sales;

import cpm.web.bl.sales.SalesTable;
import cpm.web.utils.ExecuteWebController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/authenticate/sales")
@CrossOrigin()
public class ScreenSalesTableController extends ExecuteWebController {

    @Autowired
    SalesTable salesTable;

    @GetMapping(value = "/loadMaxMenuIndex")
    public ResponseEntity<?> loadMaxMenuIndex() {
        String tmp = this.convertData();
        return ResponseEntity.status(HttpStatus.OK).body(salesTable.loadMaxMenuIndexBL());

    }
}

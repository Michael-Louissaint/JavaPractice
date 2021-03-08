package crackthecode.controllers;

import crackthecode.data.CTCDao;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ctc")
public class CTCController {

    private final CTCDao dao;


    public CTCController(CTCDao dao) {
        this.dao = dao;
    }

    //PostMapping
    //@ResponseStatus(HttpStatus.CREATED)





}

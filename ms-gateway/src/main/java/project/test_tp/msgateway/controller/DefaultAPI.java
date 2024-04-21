package project.test_tp.msgateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DefaultAPI {

    @GetMapping("/default")
    public ArrayList<?> getDefaultFormations() {
        return new ArrayList<>();
    }
}

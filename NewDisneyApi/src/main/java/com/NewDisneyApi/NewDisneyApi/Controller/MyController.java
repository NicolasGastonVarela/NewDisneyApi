package com.NewDisneyApi.NewDisneyApi.Controller;

import com.NewDisneyApi.NewDisneyApi.DataRepo.DataRepo;
import com.NewDisneyApi.NewDisneyApi.DataRepo.MovieCharacter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

    @RequestMapping("/hola")
    @ResponseBody
    String getHola(){
        return "hola\n";
    }

    @PostMapping("hola")
    @ResponseBody
    String postHola(@RequestBody String texto){
        return texto + "\n";
    }
}




/*@Autowired
    DataRepo dataRepo;

    @RequestMapping("/listar")
    @ResponseBody
    List<MovieCharacter> listar(@RequestParam("nombre") String nombre) {
        List<MovieCharacter> movieCharacterList = dataRepo.findByNombre(nombre);
        System.out.println(movieCharacterList.size());
        return movieCharacterList;
    }
    @RequestMapping("/listar2/{nombre}")
    @ResponseBody
    List<MovieCharacter> listar2(@PathVariable("nombre") String nombre) {
        List<MovieCharacter> movieCharacterList = dataRepo.findByNombre(nombre);
        System.out.println(movieCharacterList.size());
        return movieCharacterList;
    }*/
package com.cesarbassani.cursomc;

import com.cesarbassani.cursomc.domain.*;
import com.cesarbassani.cursomc.domain.enuns.EstadoPagamento;
import com.cesarbassani.cursomc.domain.enuns.TipoCliente;
import com.cesarbassani.cursomc.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.SimpleDateFormat;
import java.util.Arrays;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {


	}
}

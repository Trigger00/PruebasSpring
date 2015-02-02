package com.tecsup.springbasico;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tecsup.springbasico.model.Instrumento;
import com.tecsup.springbasico.model.Musico;

public class App {
	public static void main(String[] args) {
		ApplicationContext cntx = new ClassPathXmlApplicationContext("app.xml");
		App.beanInjeccionContructor(cntx);

	}
/*
	public static void beanSimple(ApplicationContext cntx) {
		Musico musico = (Musico) cntx.getBean("bob");
		musico.queSoy();
	}

	public static void beanConstructor(ApplicationContext cntx) {

		Musico musico = (Musico) cntx.getBean("cobain");
		System.out.println(musico.getCancionesConocidas());

	}

	public static void beanContructorReferencia(ApplicationContext cntx) {
		Musico musico = (Musico) cntx.getBean("paul");
		System.out.println(musico.getCancionesConocidas());
		musico.getInstrumento().doSonido();
	}

	public static void beanSet(ApplicationContext cntx) {
		Musico musico = (Musico) cntx.getBean("musico1");
		System.out.println(musico.getCancionesConocidas());

	}

	public static void beanGetters(ApplicationContext cntx) {
		Musico musico = (Musico) cntx.getBean("julian");
		System.out.println(musico.getCancionesConocidas());
		musico.getInstrumento().doSonido();
	}

	public static void beanFormaInterna(ApplicationContext cntx) {
		Musico musico = (Musico) cntx.getBean("calamardo");
		System.out.println(musico.getCancionesConocidas());
		musico.getInstrumento().doSonido();
	}

	public static void beanConstructorReferencia(ApplicationContext cntx) {

		Musico musico = (Musico) cntx.getBean("elvis");
		List<Instrumento> instrumentos = musico.getInstrumentos();
		for (Instrumento instrumento : instrumentos) {
			instrumento.doSonido();
		}
	}

	public static void beanNulo(ApplicationContext cntx) {
		Musico musico = (Musico) cntx.getBean("nulo");
		List<Instrumento> instrumentos = musico.getInstrumentos();
		for (Instrumento instrumento : instrumentos) {
			instrumento.doSonido();
		}

	}

	public static void beanInjeccionByName(ApplicationContext cntx) {
		Musico musico = (Musico) cntx.getBean("musico");
		musico.getInstrumento().doSonido();
	}

	public static void beanInjeccionByType(ApplicationContext cntx) {
		Musico musico = (Musico) cntx.getBean("musico2");
		List<Instrumento> instrumentos = musico.getInstrumentos();
		for (Instrumento instrumento : instrumentos) {
			instrumento.doSonido();
		}

	}
*/
	public static void beanInjeccionContructor(ApplicationContext cntx) {
		Musico musico = (Musico) cntx.getBean("musico");
		musico.getInstrumento().doSonido();

	}

}

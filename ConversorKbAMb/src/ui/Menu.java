package ui;

import java.util.Scanner;

import doll.Conv1;
import doll.Conv2;

public class Menu {

	public Scanner entrada= new Scanner(System.in);
	public void desplegarOpciones() {
		System.out.println("1-Convertir bytes a Kilobytes");
		System.out.println("2-Convertir Kilobytes a Megabytes");
		System.out.println("3-Salir");
	}
	
	public void Acciones() {
		desplegarOpciones();
		Short opc;
		double num;
		opc=entrada.nextShort();
		switch(opc) {
		case 1:
			System.out.println("----------------conversor de Bytes a Kilobytes-------------");
			System.out.println("Ingres los bytes que desee convertir a Kilobytes");
			num=entrada.nextDouble();
			Conv2 ob=new Conv2(num);
			ob.setBytes(num);
			ob.setKilobytes();
			System.out.println(ob.getKilobytes());
			Acciones();
		break;
		case 2:
			System.out.println("Convertir Bytes a Megabytes");
			System.out.println("Ingres los kylobytes que desee convertir a bytes");
			num=entrada.nextDouble();
			Conv1 ob1=new Conv1(num);
			ob1.setKylobyte(num);
			ob1.setMegabytes();
			System.out.println(ob1.getMegabytes());
			Acciones();
		case 3:
			System.exit(0);
		break;
		default:
			System.out.println("Opcion Invalida");
			Acciones();
		}
	}	
}

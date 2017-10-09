package co.simplon.PoleEmploi;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Application {

	public static final EntityManagerFactory EMF = getEntityManagerFactory();

	private static EntityManagerFactory getEntityManagerFactory() {
		return Persistence.createEntityManagerFactory("BasePatrimoineLocale");
	}
}

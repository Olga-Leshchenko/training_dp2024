package mock;

import crud.Lab2CrudInterface;
import entity.Entity;

public class lab2CrudMock implements Lab2CrudInterface {

	@Override
	public Entity readEntity() {
		// TODO Auto-generated method stub
		return new Entity ("Mock1", 23, 32.2f);
	}

	@Override
	public void updateEntity(Entity entity) {
		// TODO Auto-generated method stub

	}

}

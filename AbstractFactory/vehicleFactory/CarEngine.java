package vehicleFactory;

// class is not public, it is protected so that client can't access it
class CarEngine implements Engine{

	@Override
	public void design() {
		System.out.println("Designing car");	
	}

	@Override
	public void manufacture() {
		System.out.println("Manufactoring car");
	}

	@Override
	public void test() {
		System.out.println("testing car");
		
	}
	
}

package control;

/**
 * Creates instances of a given type of object managed by this program*/
public interface IFactory{
	
	/**
	 * @param The Class definition for the object that we want to instantiate
	 * @return An intstance of the given class*/
	public Object getInstanceOf(Class clazz, Object[] args);
}

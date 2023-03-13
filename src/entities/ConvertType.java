package entities;

public interface ConvertType {

	double convertTypes(Object obj, double value);
	
	String getMessage();
	
	String getType();

	Object[] getOption();

	Object[] getConverters();
}

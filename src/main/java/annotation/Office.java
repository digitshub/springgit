package annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
//adding the annotations
@Component ("cd")
public class Office {
    @Value("Digit")
    private String name;
    @Value("Pune")
    private String area;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
	public String toString() {
		return "Office [name=" + name + ", area=" + area + "]";
	}

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }


}

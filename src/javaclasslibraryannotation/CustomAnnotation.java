package javaclasslibraryannotation;
/* 1.Java Custom annotations or Java User-defined annotations are easy to create and use.
2.The @interface element is used to declare an annotation.
3.Three type of custom annotations are ,
 a)Marker Annotation -if interface body is empty
b)Single Value Annotation -if it has one value
c)Multi Value Annotations-if it has two value
Declaring annotations at different level,
a.TYPE	class, interface or enumeration
b.FIELD	fields
c.METHOD	methods
d.CONSTRUCTOR	constructors
e.LOCAL_VARIABLE	local variables
f.ANNOTATION_TYPE	annotation type
g.PARAMETER 	parameters
RetentionPolicy.SOURCE	refers to the source code, discarded during compilation. It will not be available in the compiled class.
RetentionPolicy.CLASS	refers to the .class file, available to java compiler but not to JVM . It is included in the class file.
RetentionPolicy.RUNTIME	refers to the runtime, available to java compiler and JVM .
@Inherited -By default, annotations are not inherited to subclasses.
The @Inherited annotation marks the annotation to be inherited to subclasses.
@Documented- Marks the annotation for inclusion in the documentation.
 */

import java.lang.annotation.*;

//whenever we create our own annotation we have to call this 2 annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE) // if we have to use annotation on class level ,TYPE
@interface SmartPhone {
  String os() default "Windows";

  int version() default 1;

}


@SmartPhone(os = "Android", version = 1) // this values will override the default values
class NokiaSeries {
  String model;
  int size;

  public NokiaSeries(String model, int size) {
    this.model = model;
    this.size = size;
  }

}

public class CustomAnnotation {


  public static void main(String[] args) {
    NokiaSeries obj = new NokiaSeries("fire", 3);
    Class c = obj.getClass(); //to fetch values from @smartphone we need to create class object with the help of reflection api
    Annotation d = c.getAnnotation(SmartPhone.class);
    SmartPhone e = (SmartPhone) d;//creating object for Smartphone annotation and typecast
    System.out.println(e.os()); //fetching os value from annotation


  }
}

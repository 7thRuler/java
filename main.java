class CPU {
 double price;
 class Processor {
 double cores;
 String manufacture;
 double getCache() {
 return 4.3;
 }
}
static class RAM {
double memmory;
String manufacture;
double getClockSpeed() {
return 5.5;
}
}
}
public class main {
public static void main(String args[])
{
 CPU cpu=new CPU();
 CPU.Processor processor=cpu.new Processor();
 CPU.RAM ram=new CPU.RAM();
 System.out.println("processor cache="+ processor.getCache());
 System.out.println("RamClockspeed="+ ram.getClockSpeed());
 }
 }

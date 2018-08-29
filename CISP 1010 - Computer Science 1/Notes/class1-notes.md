# (Java) Class 1 - 8/27/2018
***

#### ALWAYS CHECK ASSIGNMENTS/DROPBOX ON D2L!!!
(Buy) Need the access key, but (rent/buy) the book is not required.

+ [Pearson Revel](https://www.pearson.com/revel)
+ Click on student.
+ Using tempory access, good for 28 days from 8/27/2018.

### TODOs
- [x] Complete the Self-Check after 1.2.6 Communication Devices
- [ ] Complete Course Plan Book EC

***
## 1 - Introductions to Computers and Java
*The central theme of this book is to learn how to solve problems by writing a program.*

### 1.1 Introduction
#### Terms
+ **Programming**: Is the process for writing a program. 
+ **Program**: Same as software.

### 1.2 What is a Computer?
#### Terms
+ **Hardware**: The physical aspect of the computer that can be seen.
+ **Software**: The invisible instructions that control the hardware and make it work.
+ **Bus**: A system that connects all the components of the computers together.
+ **Motherboard**: Is a circuit case that connects all of the parts of a computer together.
+ **Central Processing Unit (CPU)**: A small silicon semiconductor chip with millions of transistors that executes instructions.
+ **Bits**: A binary digit 0 and 1.
+ **Byte**: A unit of storage.  Each byte consists of 8 bits. The size of the hard disk and memory is measured in bytes.  A megabyte is roughly a million bytes.
+ **Encoding Scheme**: A set of rules that govern how a computer translates characters into data the computer can actually work with.

| Name(sh) | Bytes |
|----------|-------|
| Kilobyte(KB) | 1,000 bytes *(Thousand)* |
| Megabyte(MB) | 1,000,000 bytes *(Million)* |
| Gigabyte(GB) | 1,000,000,000 bytes *(Billion)* |
| Terabyte(TB) | 1,000,000,000,000 bytes *(Trillion)* |

#### Terms(cont.)
+ **Memory**: Stores data and program instructions for CPU to execute.
+ **Storage Devices**: The permanent storage for data and programs.  Memory is volatile, because information is lost when the power is off.  Program and data are stored on a secondary storage and moved to memory when the computer actually uses them.
+ **Screen Resolution**: Specifies the number of pixels per square inch.  The higher the resolution, the sharper and clearer the image is.
+ **Pixels**: Tiny dots that form an image on the screen.
+ **Dot Pitch**: The amount of space between pixels.  the smaller the dot pitch, the better the display.
+ **Modem**: A regular modem uses a phone line and can transfer data in a speed up to 56,000 bps (bits per second).
+ **Digital Subscriber Line (DSL)**: Uses a phone line and can transfer data in a speed 20 times faster than a regular modem.
+ **Cable Modem**: Uses the TV cable line maintained by the cable company. A cable modem is as fast as a DSL.
+ **Network Interface Card (NIC)**: A device to connect a computer to a local area network (LAN). The LAN is commonly used in business, universities, and government organizations. A typical type of NIC, called 10BaseT, can transfer data at 10 Mbps.

### 1.7 A Simple Java Program
+ **Console**: Refers to the input and output device of a computer.

*Sample program*
```Java
public class Weclome {
	public static void main(String[] args) {
		// Display message Welcome to Java! on the console
		System.out.println("Welcome to Java!");
	}
}
```

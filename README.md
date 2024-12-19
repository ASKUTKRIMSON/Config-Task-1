### **README.md**

# Shell Emulator

A shell emulator designed to mimic the behavior of a UNIX-like shell, operating entirely in memory. The emulator uses a TAR archive as a virtual file system, which is loaded into memory without unpacking it onto the disk.

This project supports the following shell commands:

- `ls` — List directory contents.
- `cd` — Change the current directory.
- `exit` — Exit the emulator.
- `rev` — Reverse the contents of a file or string.
- `uptime` — Display the system uptime.
- `log` — Show or append to a log file.

The emulator runs in a graphical user interface (GUI) built in Java and is suitable for learning, experimentation, and testing.

---

## **Features**

- **Virtual File System**: Works directly with a TAR archive loaded into memory, simulating a real file system.
- **UNIX-like Shell**: Provides a familiar shell experience with essential commands.
- **Efficient in Memory**: No disk unpacking; operations are performed entirely in RAM.
- **Interactive GUI**: Runs as a Java-based graphical application for ease of use.

---

## **Getting Started**

### **Prerequisites**

- JDK 22 or higher
- Basic understanding of the command line

---

### **Installation**

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/shell_emulator.git
   cd shell_emulator
   ```

2. Ensure JDK 22+ is installed and set up on your system.

3. Compile and run the emulator using the following command:
   ```bash
   java CmdEmulatorGUI.java
   ```

---

### **Usage**

Run the emulator using the following command:
  ```bash
  java CmdEmulatorGUI.java
  ```

---

### **Commands**

#### **1. `ls`**
Lists the contents of the current or specified directory.

- Usage: `ls`
- Example:
  ```bash
  ls           # List contents of the current directory
  ```

#### **2. `cd`**
Changes the current working directory.

- Usage: `cd [path]`
- Example:
  ```bash
  cd folder/   # Change to the 'folder/' directory
  cd /         # Change to the root directory
  ```

#### **3. `exit`**
Exits the shell emulator.

- Usage: `exit`
- Example:
  ```bash
  exit  # Ends the emulator session
  ```

#### **4. `rev`**
Reverses the contents of a file or a string.

- Usage: `rev [file/string]`
- Example:
  ```bash
  rev Hello    # Output: olleH
  ```

#### **5. `uptime`**
Displays the system's uptime.

- Usage: `uptime`
- Example:
  ```bash
  uptime  # Shows how long the system has been running
  ```

#### **6. `log`**
Displays or appends to a log file.

- Usage: `log [message]`
- Example:
  ```bash
  log "This is a log entry."  # Appends "This is a log entry." to the log file
  ```

---

### **Project Structure**

The project is organized as follows:

```
shell_emulator/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com/
│   │   │   │   ├── emulator/
│   │   │   │   │   ├── CmdEmulatorGUI.java   # Main GUI application
│   │   │   │   │   ├── CommandHandler.java  # Core logic for command handling
│   │   │   │   │   ├── FileSystem.java      # Virtual file system logic
│   │   │   │   │   └── Logger.java          # Logging utility
│   │   └── resources/
│   │       └── config.properties            # Configuration files
├── test/
│   ├── java/
│   │   └── com/
│   │       └── emulator/
│   │           └── CommandHandlerTest.java  # Unit tests for commands
├── README.md                                 # Project documentation
└── build.gradle                              # Build configuration (if using Gradle)
```

---

## **Future Enhancements**

- Support for additional commands (`mv`, `rm`, etc.).
- Improved GUI features, including file explorer integration.
- Enhanced logging capabilities with timestamps.
- Command history and auto-complete functionality.

---

## **Testing**

- cd:
![image](https://github.com/user-attachments/assets/127d15cf-67fa-41fc-9247-28ce08e83ab8)

- uptime:
![image](https://github.com/user-attachments/assets/74372a8d-258d-4091-8814-b07c25f4d000)

- rev:
![image](https://github.com/user-attachments/assets/3c40a88c-1dec-4c67-a27f-aa54ce2c52c7)

- log:
![Uploading image.png…]()

- ls:
![Uploading image.png…]()




## **Contributing**

Contributions are welcome! To contribute:

1. Fork the repository.
2. Create a feature branch.
3. Commit your changes and submit a pull request.

---

##

## **License**

This project is licensed under the MIT License. See the LICENSE file for details.

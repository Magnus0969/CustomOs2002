# Custom Operating System 2002

A **UNIX-style OS simulation** in Java featuring a simple **scheduler**, **file system**, **text editor**, and **calculator** — all operable through a command-line interface.

---

## 🚀 Features

* **Scheduler**: Round-Robin scheduling simulation with user-defined quantum.
* **File System**: In-memory CRUD operations with metadata (creation & modification time).
* **Text Editor**: Console-based `.txt` file editor supporting file creation and viewing.
* **Calculator**: Simple arithmetic calculator (Add, Subtract, Multiply, Divide).

---

## 🧱 Folder Structure

```
CustomOs2002/
├── os/             # Main entry point and OS launcher
├── scheduler/      # Scheduler module
├── filesystem/     # File system module with File and FileSystem classes
├── editor/         # Text editor module
├── calculator/     # Calculator module
└── README.md       # Project documentation
```

---

## 🛠️ Tools Used

* Java 8 or above
* Standard Java libraries only

---

## 💡 How to Run

### 1. Clone the Repository

```bash
git clone https://github.com/Magnus0969/CustomOs2002.git
cd CustomOs2002
```

### 2. Compile

```bash
javac os/CustomOS.java scheduler/*.java filesystem/*.java editor/*.java calculator/*.java
```

### 3. Run

```bash
java os.CustomOS
```

---

## 🧠 Learning Outcomes

* Process scheduling fundamentals
* Java file I/O operations and console input handling
* Modular design and object-oriented programming
* Simulation of basic operating system components

---

## 🔮 Future Enhancements

* [ ] Add First-Come-First-Serve (FCFS) and Shortest-Job-First (SJF) scheduling
* [ ] Persistent file system with disk storage
* [ ] Richer text editor with editing commands
* [ ] Scientific calculator features
* [ ] Add shell command simulation interface

---

## 👨‍💻 Author

**Karthik B Magadi**
🔗 [GitHub Profile](https://github.com/Magnus0969)

---

## 📄 License

This project is licensed under the [MIT License](LICENSE).

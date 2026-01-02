# 💱 Currency Converter Application (Java)

A **console-based Currency Converter** developed using **Java**, which allows users to convert an amount from one currency to another using **real-time exchange rates** fetched from an online API.

This project demonstrates the use of **OOP concepts**, **API handling**, and **user input validation** in Java.

---

## 📌 Features

- 🌍 Select base currency and target currency  
- 🔄 Fetches **real-time exchange rates**  
- 💵 Converts entered amount accurately  
- 🧮 Displays converted amount with currency symbol  
- ❌ Handles invalid inputs gracefully  

---

## 🛠 Technologies Used

- **Language:** Java  
- **Concepts & Tools:**  
  - Object-Oriented Programming (OOP)  
  - HTTPURLConnection  
  - API Integration  
  - String Processing  
  - Input Validation  
- **IDE:** IntelliJ / Eclipse / VS Code  

---

## 📂 Project Structure

```
Currency-Converter/
│
├── CurrencyConverter.java     // Handles API calls and conversion logic
├── CurrencySymbols.java       // Maps currency codes to symbols
└── CurrencyConverterApp.java  // Main class (user interface)
```

---

## ▶ How to Run the Project

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/Currency-Converter.git
   ```

2. Navigate to the project directory:
   ```bash
   cd Currency-Converter
   ```

3. Compile the Java files:
   ```bash
   javac *.java
   ```

4. Run the program:
   ```bash
   java CurrencyConverterApp
   ```

---

## 🧪 Sample Output

```
===== Currency Converter =====
Enter base currency (USD, INR, EUR, GBP, JPY): USD
Enter target currency (USD, INR, EUR, GBP, JPY): INR
Enter amount: 10

===== Result =====
10 USD = ₹830.45 INR
```

---

## 🔐 Validation & Error Handling

- Prevents negative or zero amount conversion  
- Handles invalid currency codes  
- Displays error message if exchange rate fetch fails  

---

## 🎯 Learning Outcomes

- Understanding real-world currency conversion  
- Working with APIs in Java  
- Parsing API responses  
- Applying OOP principles in mini-projects  

---

## 🚀 Future Enhancements

- GUI-based converter (JavaFX / Swing)  
- Support for more currencies  
- Offline conversion using cached rates  
- Mobile / Web version  

---

## 📜 License

This project is licensed under the **MIT License**.

---

## 👤 Author

**Ankur Budhauliya**  
Computer Science Engineering Student

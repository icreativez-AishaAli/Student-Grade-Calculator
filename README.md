# Student Grade Calculator

A robust and user-friendly **Java-based Command Line Interface (CLI)** application designed to automate the process of calculating student grades.
This project focuses on **Defensive Programming**, ensuring that user inputs are validated before processing to prevent crashes and logic errors.

Developed by **Aisha** at **DecodeLabs**, this tool is ideal for teachers or students who want a quick, precise summary of academic performance.

## ✨ Key Features
* **Robust Input Handling:** Uses `Integer.parseInt(sc.nextLine())` to avoid the common Scanner "buffer trap" issue.
* **Defensive Programming:** Includes a validation loop to ensure marks stay within the **0-100** range.
* **Precision Processing:** Utilizes **Type Casting** (double) for total marks to ensure average percentages are accurate to two decimal places.
* **Formatted Output:** Features a structured "Result Report" with subject-wise breakdowns and a final summary status (PASS/FAIL).
* **Grade Logic:** Automatically assigns grades from **A+ to F** based on standard academic grading scales.

## 🛠️ Technologies Used
* **Language:** Java (JDK 8 or higher)
* **Concepts:** Arrays, Loops, Conditional Logic (If-Else), Input Validation, and String Formatting.

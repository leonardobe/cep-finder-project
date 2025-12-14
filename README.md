# CEP Finder

![Java](https://img.shields.io/badge/Java-21-red)
![Maven](https://img.shields.io/badge/Maven-Build-blue)
![Backend](https://img.shields.io/badge/Backend-Java-success)
![API](https://img.shields.io/badge/REST-API-lightgrey)
![License](https://img.shields.io/badge/License-MIT-green)

A clean and lightweight Java 21 back-end application that consumes the ViaCEP REST API to retrieve Brazilian address data by postal code (CEP). The project focuses on real-world back-end practices such as REST API integration using OkHttp, JSON mapping with Jackson, layered architecture, input validation, and robust exception handling.

---

## 🚀 Features

* 🔍 Search address data by CEP (Brazilian postal code)
* 🌐 Integration with the public ViaCEP REST API
* ✅ Input validation (CEP format checking)
* ⚠️ Graceful error handling for invalid or non-existent CEPs
* 🧱 Layered architecture (Controller / Service / DTO)
* 📦 Maven-based project structure

---

## 🛠️ Tech Stack

* **Java 21** (LTS)
* **Maven** (project and dependency management)
* **OkHttp** (HTTP client for API communication)
* **Jackson** (JSON serialization and deserialization)
* **RESTful API consumption**
* **ViaCEP API**

---

## 📁 Project Structure

```text
br.com.leo.cepfinder
├── controller/
├── service/
├── dto/
└── client/
```

> The structure follows separation of concerns, improving readability, maintainability, and scalability.

---

## 📦 API Reference

**Base URL:**

```
https://viacep.com.br/ws/{CEP}/json/
```

### Example Response

```json
{
  "cep": "01001-000",
  "logradouro": "Praça da Sé",
  "bairro": "Sé",
  "localidade": "São Paulo",
  "uf": "SP"
}
```

---

## ▶️ How to Run

1. Clone the repository:

```bash
git clone https://github.com/your-username/cep-finder.git
```

2. Navigate to the project folder:

```bash
cd cep-finder-project
```

3. Run the application:

Run the `Main` class from your IDE.

---

## 🧪 Input Rules

* CEP must contain **8 numeric digits**
* CEPs with a **hyphen separator** are also accepted (e.g., `01001-000`)
* The application normalizes the input by removing non-numeric characters **before sending the request to the API**
* Any other invalid format will trigger a validation error
---

## 📌 Example Usage

```text
Enter CEP: 01001000 

━━━━━━━━━━━━━━━━━━━━━━━
📮 ZIP CODE: 01001-000
━━━━━━━━━━━━━━━━━━━━━━━
🏠 Street: Praça da Sé
🏘️ Neighborhood: Sé
🏙️ City: São Paulo
🌍 State: São Paulo
🧭 Region: Sudeste
🆔 IBGE: 3550308
━━━━━━━━━━━━━━━━━━━━━━━
```

---

## 📈 Learning Outcomes

This project was designed with **Java back-end roles** in mind and reinforces:

* Building back-end applications using modern **Java (21 LTS)**
* Consuming external REST APIs using **OkHttp**
* Mapping JSON responses with **Jackson (DTO pattern)**
* Designing layered architectures (Controller / Service / DTO)
* Input validation and exception handling
* Writing clean, readable, and maintainable Java code
* Managing builds and dependencies with **Maven**

---

## 📄 License

This project is licensed under the **MIT License**.

---

## 👨‍💻 Author

Developed by **Leonardo**. If you have any suggestions or feedback, feel free to open an issue or reach out.



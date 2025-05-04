# 🧱 ModularEcommerce

> A simple e-commerce sample project built with Spring Boot using a modular monolith architecture.  
> Each domain is separated into modules: `product`, `order`, `user`, and shared `common` utilities.

---

## 📁 Project Structure

modular-ecommerce/  
├── common/        공통 예외, 유틸  
├── product/       상품 관리 모듈  
├── order/         주문 처리 모듈  
├── user/          사용자 관리 모듈  
└── api/           Spring Boot 메인 + API 진입점

---

## 🧩 Modules Overview

| Module   | Description                    |
|----------|--------------------------------|
| common   | 공통 예외, validation, 유틸 클래스 |
| product  | 상품 도메인 및 REST API         |
| order    | 주문 생성 및 관리 기능           |
| user     | 사용자 등록 및 조회              |
| api      | Spring Boot Main + API 통합 진입점 |

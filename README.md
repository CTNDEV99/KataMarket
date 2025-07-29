# 🛒 KataMarket – A TDD Practice Project
KataMarket is a training project focused on Test-Driven Development (TDD), based on a realistic use case: managing a supermarket shopping cart with the application of various discounts.

This kata aims to apply the core principles of TDD:
Red → Green → Refactor, allowing the application’s design to emerge progressively from the tests.

🎯 Goal
Simulate the behavior of a supermarket cart where:

Products can be added in specific quantities

Certain discounts may apply to specific products

The total price is automatically updated based on the applied discounts

🧱 Architecture Overview
Product: Represents a product with a name and a unit price

Car: Represents the shopping cart, capable of adding products and calculating the total with discounts

TypeDiscountApplied: Enum listing the available discount types

MarketAction: Interface defining cart-related business actions

SupermarketReceiptTest: Unit test class written using the TDD cycle

✅ TDD Approach
The project strictly follows the TDD methodology, with the following steps for each new feature:

Red: Write a failing test for a functionality that doesn’t exist yet

Green: Implement the minimal code needed to make the test pass

Refactor: Clean up the code while ensuring all tests remain green

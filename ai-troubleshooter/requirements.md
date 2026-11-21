# IT Troubleshooting Assistant
## Software Requirements Specification

**Developer:** Ayden Manuel  
**Course:** COSC 4272 Senior Seminar  
**Development Tools:** HTML, CSS, JavaScript, ChatGPT

## 1. Project Overview

The IT Troubleshooting Assistant is a browser-based application designed to help users identify and resolve common computer and network problems.

The application uses interactive diagnostic questions and rule-based decision logic to provide troubleshooting recommendations.

ChatGPT was used to assist with application planning, code generation, and development guidance.

## 2. Functional Requirements

FR-01: The application shall allow users to select a troubleshooting category.

FR-02: The application shall support internet connectivity, slow computer performance, startup problems, and software crashes.

FR-03: The application shall display diagnostic questions based on the selected category.

FR-04: The application shall accept Yes or No answers from users.

FR-05: The application shall use decision logic to determine appropriate troubleshooting recommendations.

FR-06: The application shall display troubleshooting results after completing the diagnostic questions.

FR-07: The application shall allow users to restart the troubleshooting process.

FR-08: The application shall validate category selection before beginning troubleshooting.

FR-09: The application shall provide navigation back to the developer's portfolio.

## 3. Non-Functional Requirements

NFR-01: The application shall run in modern web browsers.

NFR-02: The interface shall be responsive and usable on desktop and mobile devices.

NFR-03: The application shall use clear and readable text.

NFR-04: The application shall provide a consistent visual design.

NFR-05: The application shall not require user registration or authentication.

NFR-06: The application shall not require a database or external API.

NFR-07: The application shall operate without collecting personal information.

NFR-08: The application shall provide troubleshooting recommendations without modifying the user's computer.

## 4. System Features

- Problem category selection
- Interactive diagnostic questions
- Yes/No decision-making
- Rule-based troubleshooting recommendations
- Input validation
- Restart functionality
- Responsive user interface
- Portfolio navigation

## 5. Technology Stack

**HTML5:** Defines the application structure.

**CSS3:** Provides styling, layout, and responsive design.

**JavaScript:** Handles user interactions, decision logic, and diagnostic results.

**GitHub:** Provides source control and project hosting.

**GitHub Pages:** Hosts the working web application.

**ChatGPT:** Assists with planning, implementation, troubleshooting, and documentation.

## 6. Assumptions

- Users have access to a modern web browser.
- Users can identify the general category of their technical problem.
- Users provide accurate answers to diagnostic questions.
- Troubleshooting recommendations are general guidance rather than guaranteed solutions.
- Users have an internet connection to access the hosted application.

## 7. Project Scope

### Included

- Four common IT troubleshooting categories
- Guided diagnostic questions
- Rule-based recommendations
- Interactive web interface
- Restart functionality
- GitHub Pages deployment

### Not Included

- Live AI-generated responses
- Remote computer diagnostics
- Automatic system repairs
- User accounts
- Database storage
- Real-time hardware monitoring

## 8. Testing Requirements

The application shall be tested to verify:

1. All four troubleshooting categories can be selected.
2. Diagnostic questions display correctly.
3. Yes and No answers lead to appropriate results.
4. The restart button resets the application.
5. Invalid category selection produces an alert.
6. The application loads through GitHub Pages.
7. The interface remains usable on different screen sizes.

## 9. Future Enhancements

Potential improvements include:

- Integration with an AI language model
- Additional troubleshooting categories
- More detailed diagnostic questions
- Troubleshooting history
- Search functionality
- Accessibility improvements

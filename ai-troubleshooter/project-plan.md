# IT Troubleshooting Assistant
## Project Planning Document

**Developer:** Ayden Manuel
**Course:** COSC 4272 Senior Seminar
**Project:** AI-Assisted Software Development

## 1. Problem Statement

Computer users frequently experience technical problems
such as internet connectivity issues, slow performance,
startup failures, and software crashes.

Users with limited technical experience may struggle to
identify the causes of these problems or determine the
appropriate troubleshooting steps.

The IT Troubleshooting Assistant addresses this problem
by providing a simple, interactive application that
guides users through common diagnostic questions and
recommends possible solutions.

## 2. Project Objectives

The primary objectives of this project are:

1. Develop a functional browser-based troubleshooting tool.
2. Provide an easy-to-use interface for common IT problems.
3. Implement decision-making logic using JavaScript.
4. Help users identify potential causes of technical issues.
5. Provide practical troubleshooting recommendations.
6. Apply AI-assisted software engineering techniques.
7. Demonstrate testing, debugging, and documentation.
8. Publish the application using GitHub Pages.

## 3. Functional Requirements

The application must:

- Allow users to select a troubleshooting category.
- Support four common computer and network problems.
- Display diagnostic questions based on user selections.
- Accept Yes or No answers.
- Process answers using rule-based decision logic.
- Display appropriate troubleshooting recommendations.
- Allow users to restart the diagnostic process.
- Validate selections before starting.

## 4. System Features

### Problem Selection

Users select one of four troubleshooting categories:

- Internet Connection Issues
- Slow Computer Performance
- Computer Startup Problems
- Software Crashing

### Interactive Diagnostics

The application displays diagnostic questions that
help narrow down possible causes.

### Troubleshooting Recommendations

Based on user responses, the application provides
general recommendations for resolving the problem.

### Restart Functionality

Users can restart the diagnostic process and select
a different troubleshooting category.

## 5. Software Design

The application uses a client-side web architecture.

HTML provides the structure of the interface.

CSS controls the appearance and responsive layout.

JavaScript handles user input, diagnostic questions,
decision logic, and troubleshooting results.

### Application Workflow

1. User opens the application.
2. User selects a problem category.
3. Application validates the selection.
4. Application displays a diagnostic question.
5. User selects Yes or No.
6. JavaScript processes the answer.
7. Application displays another question or a result.
8. User reviews the recommendation.
9. User can restart the process.

### Decision-Making Design

The application stores troubleshooting questions
and recommendations in JavaScript objects.

Each diagnostic question contains possible Yes
and No branches.

The selected branch determines the next question
or final recommendation.

This approach allows troubleshooting paths to be
expanded without changing the overall interface.

## 6. Technology Stack

- HTML5: Application structure
- CSS3: Styling and responsive layout
- JavaScript: Application functionality
- Git: Version control
- GitHub: Source code hosting
- GitHub Pages: Application deployment
- ChatGPT: AI-assisted planning, coding, and documentation

The application does not require a database,
backend server, or external API.

## 7. Development Timeline

### Phase 1: Planning

- Identify the problem and target users.
- Define project objectives.
- Select technologies.
- Establish functional requirements.

### Phase 2: Initial Development

- Create the HTML interface.
- Add CSS styling.
- Implement troubleshooting categories.
- Develop JavaScript decision logic.

### Phase 3: Testing and Improvement

- Test all troubleshooting categories.
- Verify diagnostic recommendations.
- Test restart functionality.
- Check input validation.
- Improve usability and maintainability.

### Phase 4: Documentation

- Complete requirements.md.
- Create project README.md.
- Document AI-assisted development interactions.
- Capture screenshots of the application.

### Phase 5: Final Submission

- Review source code.
- Verify GitHub commit history.
- Confirm GitHub Pages deployment.
- Check documentation completeness.
- Submit the repository and application links.

## 8. AI-Assisted Development

ChatGPT is used as a software development assistant
to help with:

- Requirements analysis
- Application design
- Code generation
- Troubleshooting logic
- Testing recommendations
- Documentation preparation

The application itself uses rule-based diagnostics
rather than a live AI model.

AI interactions will be documented in a separate
AI Usage Log, including prompts, responses,
student refinements, and implementation results.

## 9. Expected Outcome

The completed project will be a functional,
publicly accessible troubleshooting application.

It will demonstrate web development, JavaScript
programming, problem-solving, software testing,
documentation, and AI-assisted software engineering.

The application will also be included in the
developer's professional GitHub portfolio.

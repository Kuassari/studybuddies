# 📚 StudyBuddies
A web application that connects university students for collaborative studying, helping them find study partners taking the same courses.

> **🎓 Final Project** - B.Sc. in Computer Science, The Open University of Israel  
> Built with a team of 2 in 3 months while learning Spring Boot from scratch

## 🎯 Problem We Solved
University students often struggle to find study partners, especially in distance learning programs. StudyBuddies connects students based on their degree programs and current courses, making it easy to form study groups and schedule collaborative learning sessions.


## ✨ Features
### User Management
- User registration and profile creation
- Profile with B.Sc. program and course enrollment information
- Match with students taking the same courses

### Study Groups
- Create study groups with customizable settings
- Configure group size limits
- Set study location preferences
- Assign roles and permissions within groups
- Group coordination and management

### Scheduling
- Schedule study sessions with matched students
- Coordinate meeting times within groups
- Track upcoming study sessions

## 🛠️ Tech Stack

**Backend:**
- Spring Boot MVC
- Java
- JDBC for database connectivity
- Maven for dependency management
- XML configuration

**Frontend:**
- JSP (JavaServer Pages)
- Thymeleaf templates
- HTML/CSS
- JavaScript

**Database:**
- MySQL with JDBC

**Development Environment:**
- IntelliJ IDEA Ultimate (provided by university)

## 🚀 Getting Started

### Prerequisites
- Java 11+ (or JDK 8+)
- Maven 3.6+
- MySQL 8.0+
- IntelliJ IDEA (recommended)

### Installation

**1. Clone the repository:**
```bash
git clone https://github.com/yourusername/studybuddies.git
cd studybuddies
```

**2. Set up MySQL database:**
```sql
CREATE DATABASE studybuddies;
```

**3. Configure database connection:**

Update `src/main/resources/application.properties`:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/studybuddies
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

# JSP configuration
spring.mvc.view.prefix=/WEB-INF/views/
spring.mvc.view.suffix=.jsp
```

**4. Build the project:**
```bash
mvn clean install
```

**5. Run the application:**
```bash
mvn spring-boot:run
```

Or run directly from IntelliJ IDEA.

**6. Access the application:**
```
http://localhost:8080
```

## 🧠 What We Learned
This project was our introduction to:
- **Spring Boot MVC framework** - Built entire backend from scratch in 3 months
- **MVC architecture pattern** - Implemented clean separation of concerns
- **JDBC database connectivity** - Direct database operations with SQL
- **JSP and Thymeleaf** - Server-side rendering for dynamic web pages
- **Maven build tool** - Dependency management and project building
- **XML configuration** - Spring framework configuration
- **Team collaboration** - Worked in a team with Git version control
- **Database design** - Modeled relationships between users, courses, and groups
- **IntelliJ IDEA Ultimate** - Professional IDE features and workflows

## 🎨 Original Vision vs. Implementation
**Original Goal:** Location-based matching (like Tinder for study partners)
**What We Built:** Course-based matching with group management system


**What We Prioritized:**
✅ Core matching functionality based on courses  
✅ Group creation and management  
✅ Study session scheduling  
✅ Role-based permissions system  


**What We Deferred:**
⏸️ Location-based matching (geolocation APIs)  
⏸️ User authentication system (due to time constraints)  
⏸️ Real-time chat functionality  

**Why:** With a 3-month timeline and learning Spring Boot simultaneously, we focused on delivering solid core functionality. The result is a working platform that successfully connects students based on their academic needs.

## 🔮 Future Enhancements
If we were to continue development:
- [ ] Implement authentication and authorization with Spring Security
- [ ] Add location-based matching using geolocation APIs
- [ ] Real-time chat functionality with WebSockets
- [ ] Migrate from JSP to modern frontend framework (React/Vue)
- [ ] Convert to REST API architecture
- [ ] Mobile responsive design improvements
- [ ] Email notifications for study sessions
- [ ] Study session history and analytics
- [ ] Rating and review system for study partners
- [ ] Integration with university course management systems


## 📝 Key Technical Decisions
**Why JDBC over JPA/Hibernate?**
- Learn fundamental database connectivity concepts
- Direct control over SQL queries and optimization
- Better understanding of data access patterns
- Suitable for our project scope and timeline

**Why JSP and Thymeleaf?**
- Native integration with Spring Boot MVC
- Server-side rendering simplified deployment
- Good fit for our 3-month learning timeline
- Focus on backend logic rather than complex frontend

**Why Maven?**
- Industry-standard build tool
- Simplified dependency management
- Easy project structure and configuration
- Integrated well with IntelliJ IDEA

**No Authentication?**
- Time management decision with 3-month constraint
- Prioritized core matching and group features
- Would be first addition in production version


## 💡 Reflection
Building StudyBuddies in 3 months while learning Spring Boot from scratch taught us valuable lessons:

**Technical Growth:**
- Mastered Spring MVC architecture and request lifecycle
- Gained hands-on experience with JDBC and SQL
- Learned Maven project management
- Understood server-side rendering with JSP

**Project Management:**
- **Scope prioritization** - Delivering working core features over ambitious extras
- **Time management** - Making strategic decisions (e.g., deferring authentication)
- **Team coordination** - Dividing work across controllers, services, and views
- **Realistic goals** - Building what's achievable within constraints

**Practical Lessons:**
- A working application with core features beats an incomplete app with everything
- Learning a framework while building is challenging but achievable
- Technical debt decisions (like skipping auth) should be documented for future work

We're proud of delivering a functional platform that solves real student problems within our academic timeline.

---

**Note:** This was a final B.Sc. project completed in 3 months while learning Spring Boot. The focus was on learning enterprise Java patterns and delivering functional software within academic constraints.

## 🤝 Contributing

This is an academic project and is not actively maintained. However, feel free to fork and build upon it!

## 📄 License

Academic Project - The Open University of Israel

# Comprehensive MCQ Test
## All Masterclass Topics Combined

### Total Questions: 100
### Topics Covered: Database (SQL & NoSQL), Query Practice, Software Roles, Linux, Software Testing, SDLC & STLC, Testing Levels & Methodologies

---

## Section 1: Database Fundamentals (SQL & NoSQL) - 15 Questions

**Q1. What does ACID stand for in database transactions?**
- A) Atomicity, Consistency, Isolation, Durability
- B) Accuracy, Consistency, Integrity, Durability
- C) Atomicity, Completeness, Isolation, Distribution
- D) Accuracy, Completeness, Integrity, Distribution

**Answer: A) Atomicity, Consistency, Isolation, Durability**

**Explanation:** ACID properties ensure reliable database transactions:
- **Atomicity**: All operations in a transaction succeed or all fail (no partial completion)
- **Consistency**: Data remains in a valid state before and after transactions
- **Isolation**: Concurrent transactions don't interfere with each other
- **Durability**: Committed transactions persist even after system failures

---

**Q2. Which type of JOIN returns all records from both tables, with NULLs where there's no match?**
- A) INNER JOIN
- B) LEFT JOIN
- C) RIGHT JOIN
- D) FULL OUTER JOIN

**Answer: D) FULL OUTER JOIN**

**Explanation:** 
- **INNER JOIN**: Returns only matching records from both tables
- **LEFT JOIN**: All records from left table + matching from right (NULLs for non-matches)
- **RIGHT JOIN**: All records from right table + matching from left (NULLs for non-matches)
- **FULL OUTER JOIN**: All records from both tables, with NULLs where matches don't exist on either side

---

**Q3. In MongoDB (NoSQL), what is a collection equivalent to in SQL?**
- A) Database
- B) Table
- C) Row
- D) Column

**Answer: B) Table**

**Explanation:** MongoDB terminology mapping:
- **Database** → Database (same in both)
- **Collection** → Table (groups of documents/records)
- **Document** → Row (individual record)
- **Field** → Column (individual data element)

MongoDB stores data in flexible JSON-like documents within collections.

---

**Q4. Which aggregate function would you use to count non-NULL values in a column?**
- A) SUM()
- B) COUNT()
- C) AVG()
- D) MAX()

**Answer: B) COUNT()**

**Explanation:** 
- **COUNT(column_name)**: Counts non-NULL values in specified column
- **COUNT(*)**: Counts all rows including NULLs
- **SUM()**: Adds numeric values
- **AVG()**: Calculates average of numeric values
- **MAX()/MIN()**: Returns maximum/minimum value

Note: COUNT(*) counts rows, COUNT(column) ignores NULLs.

---

**Q5. What does BASE stand for in NoSQL databases?**
- A) Basic Availability, Soft state, Eventual consistency
- B) Basically Available, Soft state, Eventual consistency
- C) Basic Architecture, Simple state, Easy consistency
- D) Basically Available, Simple state, Easy consistency

**Answer: B) Basically Available, Soft state, Eventual consistency**

**Explanation:** BASE is the NoSQL alternative to ACID:
- **Basically Available**: System guarantees availability (may not be consistent)
- **Soft state**: System state may change over time without input (due to eventual consistency)
- **Eventual consistency**: System will become consistent over time, but may be temporarily inconsistent

BASE allows for higher availability and scalability at the cost of immediate consistency.

---

**Q6. Which SQL clause is used to filter groups created by GROUP BY?**
- A) WHERE
- B) FILTER
- C) HAVING
- D) SELECT

**Answer: C) HAVING**

**Explanation:** 
- **WHERE**: Filters individual rows BEFORE grouping
- **HAVING**: Filters groups AFTER grouping and aggregation
- Example: `SELECT department, AVG(salary) FROM employees GROUP BY department HAVING AVG(salary) > 50000`

Key difference: WHERE works on rows, HAVING works on aggregated results.

---

**Q7. Which NoSQL database type is best for storing relationships like social networks?**
- A) Document Store
- B) Key-Value Store
- C) Column-Family Store
- D) Graph Database

**Answer: D) Graph Database**

**Explanation:** 
- **Graph Database** (Neo4j, ArangoDB): Stores nodes and relationships, perfect for connected data like social networks, recommendation engines
- **Document Store** (MongoDB): Good for hierarchical data
- **Key-Value** (Redis): Simple lookups, caching
- **Column-Family** (Cassandra): Time-series data, large-scale writes

Graph databases excel at traversing relationships efficiently.

---

**Q8. What is the purpose of creating an index on a database column?**
- A) To ensure data uniqueness
- B) To speed up query retrieval
- C) To enforce foreign key constraints
- D) To compress data

**Answer: B) To speed up query retrieval**

**Explanation:** Indexes work like a book's index:
- Create a separate data structure for fast lookups
- Dramatically improve SELECT query performance
- Trade-off: Slower INSERT/UPDATE/DELETE operations (index must be updated)
- Use on columns frequently used in WHERE, JOIN, ORDER BY clauses

Indexes don't guarantee uniqueness (that's a UNIQUE constraint) but PRIMARY KEY automatically creates a unique index.

---

**Q9. Which SQL command is used to modify existing table structure?**
- A) UPDATE
- B) MODIFY
- C) ALTER
- D) CHANGE

**Answer: C) ALTER**

**Explanation:** 
- **ALTER TABLE**: Modifies table structure (add/drop columns, change data types)
  - Example: `ALTER TABLE employees ADD COLUMN email VARCHAR(100)`
- **UPDATE**: Modifies data within existing rows
- **MODIFY**: Not a standard SQL command (MySQL specific syntax within ALTER)
- **CHANGE**: Not a standard SQL command

---

**Q10. In a relational database, what ensures that a foreign key value must exist in the referenced table?**
- A) Primary Key constraint
- B) Unique constraint
- C) Check constraint
- D) Referential integrity

**Answer: D) Referential integrity**

**Explanation:** 
- **Referential Integrity**: Ensures relationships between tables remain consistent
- Foreign key values must either be NULL or exist in the referenced table's primary key
- Prevents orphaned records (child records without valid parent)
- Database enforces this through foreign key constraints

Example: order.customer_id must exist in customers.customer_id

---

**Q11. Which MongoDB operation is equivalent to SQL's INSERT?**
- A) insertOne() / insertMany()
- B) addDocument()
- C) createRecord()
- D) pushData()

**Answer: A) insertOne() / insertMany()**

**Explanation:** MongoDB CRUD operations:
- **insertOne()**: Insert single document
- **insertMany()**: Insert multiple documents
- **find()**: Equivalent to SELECT
- **updateOne()/updateMany()**: Equivalent to UPDATE
- **deleteOne()/deleteMany()**: Equivalent to DELETE

Example: `db.users.insertOne({name: "John", age: 30})`

---

**Q12. What does the SQL TRUNCATE command do?**
- A) Deletes specific rows based on a condition
- B) Removes all rows from a table but keeps the structure
- C) Drops the entire table including structure
- D) Archives old data to a backup table

**Answer: B) Removes all rows from a table but keeps the structure**

**Explanation:** 
- **TRUNCATE TABLE**: Fast deletion of all rows, cannot be rolled back in most databases, resets auto-increment
- **DELETE FROM table**: Slower, can be rolled back, can use WHERE clause, doesn't reset auto-increment
- **DROP TABLE**: Removes table structure and data completely

TRUNCATE is a DDL command (Data Definition Language), DELETE is DML (Data Manipulation Language).

---

**Q13. In SQL, what does the DISTINCT keyword do?**
- A) Sorts the results in ascending order
- B) Removes duplicate rows from the result set
- C) Counts the number of unique values
- D) Filters NULL values

**Answer: B) Removes duplicate rows from the result set**

**Explanation:** 
- **DISTINCT**: Returns unique values only
- Example: `SELECT DISTINCT city FROM customers` returns each city only once
- Can be used with multiple columns: `SELECT DISTINCT city, country FROM customers`
- Useful for finding unique values in a column

Note: COUNT(DISTINCT column) counts unique values.

---

**Q14. Which operator is used for pattern matching in SQL?**
- A) MATCH
- B) LIKE
- C) CONTAINS
- D) REGEX

**Answer: B) LIKE**

**Explanation:** 
- **LIKE**: Pattern matching with wildcards
  - `%` matches any sequence of characters
  - `_` matches any single character
- Examples:
  - `WHERE name LIKE 'J%'` (starts with J)
  - `WHERE email LIKE '%@gmail.com'` (ends with @gmail.com)
  - `WHERE code LIKE 'A_C'` (A, any character, C)

Some databases also support REGEXP/REGEX for more complex patterns.

---

**Q15. What is denormalization in database design?**
- A) Converting normalized data back to original form
- B) Intentionally introducing redundancy to improve read performance
- C) Removing all relationships between tables
- D) Encrypting sensitive data

**Answer: B) Intentionally introducing redundancy to improve read performance**

**Explanation:** 
- **Normalization**: Organizing data to reduce redundancy (1NF, 2NF, 3NF)
- **Denormalization**: Strategic redundancy for performance
  - Trade-off: Faster reads, slower writes, more storage
  - Common in data warehousing and read-heavy applications
  - Example: Storing calculated totals instead of computing them each time

NoSQL databases are often denormalized by design.

---

## Section 2: SQL Query Practice - 15 Questions

**Q16. What will this query return: SELECT * FROM users WHERE age IS NULL?**
- A) Users with age = 0
- B) Users where age field is empty
- C) Users where age has no value assigned
- D) Syntax error

**Answer: C) Users where age has no value assigned**

**Explanation:** 
- **NULL**: Represents missing or unknown value (not zero, not empty string)
- **IS NULL**: Checks for NULL values (cannot use = NULL)
- **IS NOT NULL**: Checks for non-NULL values
- Important: NULL != NULL (NULL compared to anything is NULL, not TRUE or FALSE)

Example: `age = NULL` won't work, use `age IS NULL`

---

**Q17. What is the result of: SELECT 10 / 3 in SQL?**
- A) 3.33
- B) 3
- C) 3.3333...
- D) Depends on the database

**Answer: D) Depends on the database**

**Explanation:** 
- Integer division behavior varies by database:
  - **MySQL/PostgreSQL**: 10 / 3 = 3 (integer division)
  - **SQL Server**: 10 / 3 = 3
  - For decimal results: Use `10.0 / 3` or `CAST(10 AS DECIMAL) / 3`
- Different databases handle implicit type conversion differently

Always be explicit with data types for precision calculations.

---

**Q18. Which query correctly finds the second highest salary?**
- A) SELECT MAX(salary) FROM employees WHERE salary < MAX(salary)
- B) SELECT salary FROM employees ORDER BY salary DESC LIMIT 1, 1
- C) SELECT SECOND(salary) FROM employees
- D) SELECT TOP 2 salary FROM employees

**Answer: B) SELECT salary FROM employees ORDER BY salary DESC LIMIT 1, 1**

**Explanation:** 
- **LIMIT 1, 1**: Skip first row (highest), return next row (second highest)
- Option A won't work (can't nest aggregate without subquery)
- Better approach with subquery: 
  ```sql
  SELECT MAX(salary) FROM employees 
  WHERE salary < (SELECT MAX(salary) FROM employees)
  ```
- Or using DENSE_RANK() for handling ties

---

**Q19. What does the COALESCE function do?**
- A) Combines multiple columns into one
- B) Returns the first non-NULL value from a list
- C) Counts NULL values
- D) Converts NULL to zero

**Answer: B) Returns the first non-NULL value from a list**

**Explanation:** 
- **COALESCE(val1, val2, val3, ...)**: Returns first non-NULL value
- Example: `COALESCE(phone_mobile, phone_home, 'No phone')` returns first available phone number
- Useful for default values: `COALESCE(discount, 0)` treats NULL as 0
- Similar to IFNULL() or NVL() in some databases, but accepts multiple arguments

---

**Q20. What's the difference between UNION and UNION ALL?**
- A) UNION is faster than UNION ALL
- B) UNION removes duplicates, UNION ALL keeps them
- C) UNION works with all data types, UNION ALL only with numbers
- D) They are identical

**Answer: B) UNION removes duplicates, UNION ALL keeps them**

**Explanation:** 
- **UNION**: Combines results and removes duplicates (slower, requires sorting)
- **UNION ALL**: Combines results keeping all rows including duplicates (faster)
- Both require same number of columns with compatible data types
- Use UNION ALL when you know there are no duplicates or duplicates are acceptable

Example:
```sql
SELECT name FROM customers
UNION
SELECT name FROM suppliers  -- Removes duplicate names
```

---

**Q21. What does the SQL CASE statement do?**
- A) Changes the case of text (upper/lower)
- B) Implements conditional logic (if-then-else)
- C) Groups similar values together
- D) Handles error cases

**Answer: B) Implements conditional logic (if-then-else)**

**Explanation:** 
- **CASE**: SQL's conditional expression
- Two forms:
  ```sql
  -- Simple CASE
  CASE status
    WHEN 'active' THEN 'Current'
    WHEN 'inactive' THEN 'Former'
    ELSE 'Unknown'
  END
  
  -- Searched CASE
  CASE
    WHEN age < 18 THEN 'Minor'
    WHEN age < 65 THEN 'Adult'
    ELSE 'Senior'
  END
  ```
- Used in SELECT, WHERE, ORDER BY clauses

---

**Q22. What is a correlated subquery?**
- A) A subquery that runs only once
- B) A subquery that references columns from the outer query
- C) A subquery that returns multiple columns
- D) A subquery using INNER JOIN

**Answer: B) A subquery that references columns from the outer query**

**Explanation:** 
- **Correlated Subquery**: Inner query depends on outer query, executes for each row
- Example:
  ```sql
  SELECT e1.name, e1.salary
  FROM employees e1
  WHERE salary > (SELECT AVG(salary) 
                  FROM employees e2 
                  WHERE e2.department = e1.department)
  ```
- Finds employees earning above their department's average
- Generally slower than JOINs (runs for each row)
- Alternative: Use JOINs or CTEs for better performance

---

**Q23. What does the EXPLAIN command do?**
- A) Documents what a query does
- B) Shows query execution plan
- C) Translates SQL to natural language
- D) Provides error explanations

**Answer: B) Shows query execution plan**

**Explanation:** 
- **EXPLAIN**: Analyzes how database will execute a query
- Shows:
  - Index usage
  - Join order
  - Scan type (full table scan vs index scan)
  - Estimated rows examined
- Used for query optimization
- Variations: EXPLAIN ANALYZE (PostgreSQL), EXPLAIN PLAN (Oracle)

Example: `EXPLAIN SELECT * FROM users WHERE email = 'test@example.com'`

---

**Q24. Which is more efficient for checking existence?**
- A) SELECT COUNT(*) FROM table WHERE condition
- B) SELECT * FROM table WHERE condition
- C) SELECT EXISTS(SELECT 1 FROM table WHERE condition)
- D) They are all the same

**Answer: C) SELECT EXISTS(SELECT 1 FROM table WHERE condition)**

**Explanation:** 
- **EXISTS**: Returns TRUE/FALSE as soon as first match is found (stops immediately)
- **COUNT(*)**: Must scan all matching rows to count them
- **SELECT ***: Returns all data (wasteful if you just need to check existence)
- EXISTS is optimized for boolean checks

Example:
```sql
IF EXISTS(SELECT 1 FROM orders WHERE customer_id = 123)
  -- Customer has orders
```

---

**Q25. What is a CTE (Common Table Expression)?**
- A) A temporary result set defined within a query
- B) A permanent table in the database
- C) A type of index
- D) A constraint type

**Answer: A) A temporary result set defined within a query**

**Explanation:** 
- **CTE (WITH clause)**: Named temporary result set, exists only during query execution
- Benefits:
  - Improves readability
  - Can be referenced multiple times
  - Enables recursive queries
- Example:
  ```sql
  WITH high_earners AS (
    SELECT * FROM employees WHERE salary > 100000
  )
  SELECT * FROM high_earners WHERE department = 'IT'
  ```
- More readable than nested subqueries

---

**Q26. What does the BETWEEN operator include?**
- A) Only the lower bound
- B) Only the upper bound
- C) Both lower and upper bounds (inclusive)
- D) Neither bound

**Answer: C) Both lower and upper bounds (inclusive)**

**Explanation:** 
- **BETWEEN**: Inclusive range operator
- `WHERE age BETWEEN 18 AND 65` means age >= 18 AND age <= 65
- Equivalent to: `WHERE age >= 18 AND age <= 65`
- Works with numbers, dates, strings
- For exclusive ranges, use < and > operators

Note: Date ranges need careful handling (include time portion).

---

**Q27. What is the purpose of the GROUP BY clause?**
- A) To sort results
- B) To combine rows with same values in specified columns
- C) To filter results
- D) To join tables

**Answer: B) To combine rows with same values in specified columns**

**Explanation:** 
- **GROUP BY**: Aggregates rows sharing common values
- Must be used with aggregate functions (COUNT, SUM, AVG, MAX, MIN)
- Example:
  ```sql
  SELECT department, COUNT(*) as employee_count
  FROM employees
  GROUP BY department
  ```
- Non-aggregated columns in SELECT must be in GROUP BY
- Use HAVING to filter groups, WHERE to filter rows before grouping

---

**Q28. What is query optimization?**
- A) Making queries shorter
- B) Improving query execution speed and efficiency
- C) Removing unnecessary columns
- D) Converting to stored procedures

**Answer: B) Improving query execution speed and efficiency**

**Explanation:** 
- **Query Optimization**: Process of making queries run faster with fewer resources
- Techniques:
  - Create appropriate indexes
  - Avoid SELECT *
  - Use WHERE to filter early
  - Optimize JOINs (proper order, indexes)
  - Avoid functions on indexed columns
  - Use LIMIT for large result sets
  - Analyze with EXPLAIN
- Balance between performance and maintainability

---

**Q29. What does the IN operator do?**
- A) Checks if value is within a range
- B) Checks if value matches any value in a list
- C) Checks if value is inside a string
- D) Checks if record is in another table

**Answer: B) Checks if value matches any value in a list**

**Explanation:** 
- **IN**: Shorthand for multiple OR conditions
- Example: `WHERE city IN ('New York', 'London', 'Tokyo')`
- Equivalent to: `WHERE city = 'New York' OR city = 'London' OR city = 'Tokyo'`
- Can use with subquery: `WHERE id IN (SELECT customer_id FROM orders)`
- Opposite: NOT IN
- More readable and sometimes better optimized than multiple ORs

---

**Q30. What's the difference between DELETE and TRUNCATE?**
- A) They are identical
- B) DELETE can use WHERE, TRUNCATE removes all rows
- C) TRUNCATE is slower
- D) DELETE removes table structure

**Answer: B) DELETE can use WHERE, TRUNCATE removes all rows**

**Explanation:** 
| Feature | DELETE | TRUNCATE |
|---------|--------|----------|
| WHERE clause | Supported | Not supported |
| Speed | Slower (row by row) | Faster (all at once) |
| Rollback | Can rollback | Cannot rollback (in most DBs) |
| Triggers | Fires triggers | Doesn't fire triggers |
| Auto-increment | Preserves counter | Resets counter |
| Type | DML | DDL |

Use DELETE for selective removal, TRUNCATE for clearing entire table.

---

## Section 3: Software Roles - 15 Questions

**Q31. What is the primary responsibility of a Frontend Engineer?**
- A) Database design
- B) Server-side logic
- C) User interface and client-side functionality
- D) Network security

**Answer: C) User interface and client-side functionality**

**Explanation:** 
Frontend Engineers focus on:
- Building user interfaces (UI)
- Implementing user experience (UX) designs
- Client-side logic and interactivity
- Working with HTML, CSS, JavaScript
- Framework expertise (React, Vue, Angular)
- Responsive design
- Browser compatibility
- Performance optimization (page load speed)

They bridge design and backend, ensuring users can interact with applications effectively.

---

**Q32. What does a DevOps Engineer do?**
- A) Writes application code only
- B) Bridges development and operations, automates deployment
- C) Manages only server hardware
- D) Performs manual testing

**Answer: B) Bridges development and operations, automates deployment**

**Explanation:** 
DevOps Engineers focus on:
- **CI/CD pipelines**: Automating build, test, deploy processes
- **Infrastructure as Code**: Managing servers via code (Terraform, CloudFormation)
- **Monitoring & Logging**: System health tracking (Prometheus, Grafana)
- **Container orchestration**: Docker, Kubernetes
- **Cloud platforms**: AWS, Azure, GCP
- **Collaboration**: Breaking down silos between dev and ops

Goal: Faster, more reliable software delivery through automation.

---

**Q33. What is the difference between SDE I and SDE II at Amazon?**
- A) No difference, just title
- B) SDE II has more experience and handles system design
- C) SDE I only writes tests
- D) SDE II only manages people

**Answer: B) SDE II has more experience and handles system design**

**Explanation:** 
| Aspect | SDE I | SDE II |
|--------|-------|--------|
| Experience | 0-3 years | 3-5 years |
| Scope | Individual features | Larger systems |
| Design | Implements designs | Creates designs |
| Mentorship | Receives mentoring | Mentors junior engineers |
| Independence | Needs guidance | Works independently |
| Impact | Team level | Multi-team level |

SDE II acts as technical lead for projects while SDE I focuses on execution.

---

**Q34. What is a Full Stack Engineer?**
- A) Someone who only works with full databases
- B) An engineer proficient in both frontend and backend development
- C) A manager who oversees all development
- D) A specialist in one technology stack

**Answer: B) An engineer proficient in both frontend and backend development**

**Explanation:** 
Full Stack Engineers work on:
- **Frontend**: HTML, CSS, JavaScript, React/Vue/Angular
- **Backend**: Node.js, Python, Java, APIs
- **Databases**: SQL and NoSQL
- **DevOps**: Basic deployment knowledge
- **Version control**: Git

Advantages:
- Understand entire application flow
- Can work on any part of the project
- Better problem-solving with full context
- Valuable for startups and small teams

Trade-off: May not be as specialized as dedicated frontend/backend engineers.

---

**Q35. What does a Data Engineer primarily work on?**
- A) Machine learning models
- B) Data pipelines and ETL processes
- C) Frontend dashboards
- D) Network security

**Answer: B) Data pipelines and ETL processes**

**Explanation:** 
Data Engineers build and maintain:
- **Data pipelines**: Automated data movement and transformation
- **ETL processes**: Extract, Transform, Load data from multiple sources
- **Data warehouses**: Centralized data storage (Snowflake, Redshift)
- **Data lakes**: Raw data storage (S3, Azure Data Lake)
- **Data quality**: Ensuring accuracy and consistency
- **Scalability**: Handling large volumes of data

Tools: Apache Spark, Airflow, Kafka, SQL, Python

Different from Data Scientists (who analyze data) and Data Analysts (who create reports).

---

**Q36. What are Amazon's Leadership Principles used for?**
- A) Only for executive decisions
- B) Evaluating candidates and employee performance
- C) Marketing slogans
- D) Customer service scripts

**Answer: B) Evaluating candidates and employee performance**

**Explanation:** 
Amazon's 16 Leadership Principles guide:
- **Hiring**: Behavioral interview questions based on principles
- **Performance reviews**: Evaluated against principles
- **Decision making**: Framework for choices
- **Company culture**: Shared values across organization

Examples:
- Customer Obsession: Start with customer and work backwards
- Bias for Action: Speed matters in business
- Dive Deep: Leaders operate at all levels

These aren't just posters—they're actively used in daily work and advancement decisions.

---

**Q37. What is the role of a Product Manager?**
- A) Writing code for products
- B) Defining product vision and roadmap
- C) Testing the final product
- D) Designing user interfaces

**Answer: B) Defining product vision and roadmap**

**Explanation:** 
Product Managers (PMs):
- **Define WHAT to build** (engineers determine HOW)
- Create product roadmaps and prioritize features
- Gather requirements from customers and stakeholders
- Make data-driven decisions
- Balance business goals, user needs, and technical constraints
- Work with cross-functional teams (engineering, design, marketing)
- Track metrics and KPIs

Key skills: Communication, analytical thinking, business acumen
PM doesn't manage people—they manage products.

---

**Q38. What does a Site Reliability Engineer (SRE) do?**
- A) Designs website layouts
- B) Ensures system reliability and scalability
- C) Writes marketing content
- D) Handles customer support

**Answer: B) Ensures system reliability and scalability**

**Explanation:** 
SREs (pioneered by Google) focus on:
- **System reliability**: Keeping services running (uptime targets like 99.9%)
- **Incident response**: On-call rotations, troubleshooting outages
- **Automation**: Eliminating manual operational tasks
- **Capacity planning**: Ensuring systems can handle load
- **Monitoring**: Alerting and observability
- **Performance**: Latency and throughput optimization

Philosophy: Treat operations as software problems
Tools: Kubernetes, Terraform, Prometheus, scripting
Balance between feature development and reliability work.

---

**Q39. What level comes after Senior Engineer in typical career progression?**
- A) Junior Engineer
- B) Mid-Level Engineer
- C) Staff/Principal Engineer or Engineering Manager
- D) Intern

**Answer: C) Staff/Principal Engineer or Engineering Manager**

**Explanation:** 
Career paths typically split at Senior level:

**Technical Track:**
- Senior Engineer → Staff Engineer → Principal Engineer → Distinguished Engineer
- Focus: Technical depth, architecture, organization-wide impact

**Management Track:**
- Senior Engineer → Engineering Manager → Senior Manager → Director → VP
- Focus: People management, team growth, strategic planning

Some companies allow switching between tracks.

Key difference:
- Staff/Principal: Individual contributor with high technical impact
- Manager: People and project management

---

**Q40. What is the primary focus of a Machine Learning Engineer?**
- A) Building frontend interfaces
- B) Deploying and maintaining ML models in production
- C) Database administration
- D) Network configuration

**Answer: B) Deploying and maintaining ML models in production**

**Explanation:** 
ML Engineers (different from Data Scientists):
- **Deploy models**: Take research models to production
- **MLOps**: CI/CD for ML, model versioning, monitoring
- **Scalability**: Serve predictions at scale
- **Infrastructure**: GPU clusters, training pipelines
- **Feature engineering**: Preparing data for models
- **Model monitoring**: Detecting drift and performance degradation

Tools: TensorFlow, PyTorch, Kubeflow, MLflow, SageMaker
Bridge between data science (research) and engineering (production systems).

---

**Q41. What is the "Two Pizza Team" rule at Amazon?**
- A) Team lunch budget policy
- B) Teams should be small enough to be fed by two pizzas
- C) Mandatory team building activity
- D) Customer service metric

**Answer: B) Teams should be small enough to be fed by two pizzas**

**Explanation:** 
Amazon's organizational principle:
- **Small teams**: Typically 6-10 people
- **Autonomous**: Own their services end-to-end
- **Faster decisions**: Less coordination overhead
- **Clear accountability**: Each team owns specific services
- **Better communication**: Everyone knows everyone

Benefits:
- Faster innovation
- Clearer ownership
- Reduced bureaucracy
- Easier to manage

Related to microservices architecture and agile methodology.

---

**Q42. What does API stand for in software development?**
- A) Advanced Programming Interface
- B) Application Programming Interface
- C) Automated Process Integration
- D) Applied Programming Instructions

**Answer: B) Application Programming Interface**

**Explanation:** 
APIs are:
- **Contracts** between software components
- **Standardized ways** for programs to communicate
- **Abstraction layers** hiding implementation details

Types:
- **REST APIs**: HTTP-based, most common for web services
- **GraphQL**: Query language for APIs
- **SOAP**: XML-based, enterprise systems
- **gRPC**: High-performance, modern

Example: Weather app uses API to fetch data from weather service
Backend engineer designs APIs, frontend engineer consumes them.

---

**Q43. What is the main responsibility of a QA Engineer?**
- A) Writing production code
- B) Ensuring software quality through testing
- C) Designing user interfaces
- D) Managing databases

**Answer: B) Ensuring software quality through testing**

**Explanation:** 
QA (Quality Assurance) Engineers:
- **Test planning**: Create test strategies and test cases
- **Manual testing**: Exploratory testing, usability testing
- **Automation**: Write automated test scripts (Selenium, Cypress)
- **Bug reporting**: Document and track defects
- **Regression testing**: Ensure new changes don't break existing features
- **Performance testing**: Load and stress testing

Different from:
- **QA Analyst**: More focus on manual testing
- **SDET** (Software Development Engineer in Test): More coding, automation focus

Goal: Prevent bugs from reaching production.

---

**Q44. In Agile methodology, what is a Sprint?**
- A) A fast-running competition
- B) A fixed time period (usually 2-4 weeks) for completing work
- C) Emergency bug fix deployment
- D) Performance optimization phase

**Answer: B) A fixed time period (usually 2-4 weeks) for completing work**

**Explanation:** 
Sprints in Scrum/Agile:
- **Time-boxed iterations**: Usually 2 weeks (1-4 weeks typical)
- **Fixed duration**: Doesn't change mid-sprint
- **Sprint goal**: Specific objective for the iteration
- **Deliverables**: Working software increment

Sprint cycle:
1. Sprint Planning: Select work for sprint
2. Daily Standups: 15-minute syncs
3. Development: Build features
4. Sprint Review: Demo completed work
5. Retrospective: Team improvement discussion

Allows for regular feedback and adaptation.

---

**Q45. What does "CI/CD" stand for?**
- A) Code Integration/Code Delivery
- B) Continuous Integration/Continuous Deployment
- C) Central Infrastructure/Cloud Distribution
- D) Component Integration/Component Design

**Answer: B) Continuous Integration/Continuous Deployment**

**Explanation:** 
**Continuous Integration (CI):**
- Automatically build and test code when developers commit
- Catches bugs early
- Tools: Jenkins, GitHub Actions, CircleCI

**Continuous Deployment (CD):**
- Automatically deploy passing code to production
- Or Continuous Delivery: Deploy to staging, manual production release
- Faster feature releases

Pipeline example:
1. Developer commits code
2. CI runs tests automatically
3. If tests pass, build artifact
4. Deploy to staging
5. Deploy to production (automated or manual approval)

Benefits: Faster delivery, fewer manual errors, quick feedback.

---

## Section 4: Linux Fundamentals - 15 Questions

**Q46. What does the 'ls -la' command do?**
- A) Lists large files only
- B) Lists all files including hidden ones with detailed information
- C) Lists last accessed files
- D) Lists locked files

**Answer: B) Lists all files including hidden ones with detailed information**

**Explanation:** 
- **ls**: List directory contents
- **-l**: Long format (permissions, owner, size, date)
- **-a**: All files including hidden (starting with .)

Output shows:
```
-rw-r--r-- 1 user group 1234 Jan 20 10:30 file.txt
```
- Permissions (-rw-r--r--)
- Owner (user)
- Group (group)
- Size (1234 bytes)
- Date and filename

Common variations: `ls -lh` (human-readable sizes), `ls -lt` (sorted by time)

---

**Q47. What is the purpose of the 'chmod' command?**
- A) Change file owner
- B) Change file permissions
- C) Change file modification time
- D) Change file location

**Answer: B) Change file permissions**

**Explanation:** 
chmod (change mode) modifies file permissions:

**Numeric method (octal):**
- r (read) = 4
- w (write) = 2
- x (execute) = 1

Example: `chmod 755 script.sh`
- Owner: 7 (4+2+1) = rwx
- Group: 5 (4+0+1) = r-x
- Others: 5 (4+0+1) = r-x

**Symbolic method:**
- `chmod u+x script.sh` (add execute for user)
- `chmod go-w file.txt` (remove write for group and others)

Common permissions:
- 644: Files (rw-r--r--)
- 755: Executables (rwxr-xr-x)
- 600: Private files (rw-------)

---

**Q48. What does the '/' directory represent in Linux?**
- A) User's home directory
- B) Root directory (top of filesystem hierarchy)
- C) Current directory
- D) Temporary directory

**Answer: B) Root directory (top of filesystem hierarchy)**

**Explanation:** 
Linux filesystem hierarchy:
- **/**: Root directory, top of tree
- **/home**: User home directories (/home/username)
- **/etc**: Configuration files
- **/var**: Variable data (logs, databases)
- **/usr**: User programs and data
- **/bin**: Essential binaries (commands)
- **/tmp**: Temporary files
- **/opt**: Optional software

All paths start from / (unlike Windows C:\, D:\)
Absolute path: /home/user/file.txt
Relative path: ../other/file.txt

---

**Q49. What does the 'grep' command do?**
- A) Groups files
- B) Searches for patterns in text
- C) Removes files
- D) Changes file permissions

**Answer: B) Searches for patterns in text**

**Explanation:** 
grep (Global Regular Expression Print):
- Searches for text patterns in files
- Case-sensitive by default

Examples:
```bash
grep "error" log.txt              # Find "error" in file
grep -i "error" log.txt           # Case-insensitive search
grep -r "error" /var/log/         # Recursive search in directory
grep -n "error" log.txt           # Show line numbers
grep -v "error" log.txt           # Invert match (exclude lines)
```

Combined with pipes:
```bash
ps aux | grep "python"            # Find Python processes
cat file.txt | grep "pattern"     # Search in file output
```

Essential for log analysis and text processing.

---

**Q50. What is the difference between 'rm' and 'rm -rf'?**
- A) No difference
- B) rm -rf removes directories recursively and forcefully
- C) rm -rf is faster
- D) rm -rf works on hidden files only

**Answer: B) rm -rf removes directories recursively and forcefully**

**Explanation:** 
- **rm**: Remove files only
- **rm -r**: Recursive, removes directories and contents
- **rm -f**: Force, no confirmation prompts
- **rm -rf**: Recursive + force (dangerous!)

Examples:
```bash
rm file.txt                       # Remove single file
rm -r mydir/                      # Remove directory and contents
rm -rf mydir/                     # Remove without prompting
rm -i file.txt                    # Interactive (asks confirmation)
```

⚠️ **WARNING**: `rm -rf /` as root can delete entire system!
Always double-check paths before running rm -rf.

---

**Q51. What does the 'sudo' command do?**
- A) Shows user data
- B) Executes commands with superuser (root) privileges
- C) Sorts files
- D) Saves user documents

**Answer: B) Executes commands with superuser (root) privileges**

**Explanation:** 
sudo (Superuser Do):
- Runs commands as root/administrator
- Requires user to be in sudoers file
- Prompts for user's password (not root password)
- Logs all sudo commands for security

Examples:
```bash
sudo apt update                    # Update package lists (requires admin)
sudo systemctl restart nginx       # Restart service
sudo -i                           # Switch to root shell
sudo su - otheruser               # Switch to another user
```

Why use sudo instead of logging in as root?
- Better security (logged actions)
- Minimizes time with elevated privileges
- Audit trail of administrative actions

---

**Q52. What does the pipe (|) operator do in Linux?**
- A) Creates files
- B) Connects output of one command to input of another
- C) Separates commands on same line
- D) Comments out commands

**Answer: B) Connects output of one command to input of another**

**Explanation:** 
Pipe (|) chains commands together:

Examples:
```bash
ls -la | grep "txt"               # List files, filter for .txt
cat log.txt | grep "error" | wc -l  # Count error lines
ps aux | sort -k 3 -r | head -10  # Top 10 CPU processes
cat file.txt | sed 's/old/new/g' | sort | uniq  # Complex pipeline
```

How it works:
- Command1 stdout → Command2 stdin
- Commands run concurrently
- Data flows through pipeline

Related operators:
- `>` : Redirect output to file (overwrite)
- `>>`: Append output to file
- `<` : Read input from file

---

**Q53. What is the purpose of the '/etc' directory?**
- A) Stores executable files
- B) Contains system configuration files
- C) Temporary file storage
- D) User home directories

**Answer: B) Contains system configuration files**

**Explanation:** 
/etc (et cetera) stores:
- **System configurations**: /etc/hostname, /etc/timezone
- **Service configs**: /etc/nginx/, /etc/apache2/
- **User/group info**: /etc/passwd, /etc/group
- **Network settings**: /etc/hosts, /etc/resolv.conf
- **Init scripts**: /etc/init.d/

Important files:
```
/etc/passwd          # User accounts
/etc/shadow          # Encrypted passwords
/etc/hosts           # Hostname to IP mapping
/etc/fstab           # Filesystem mount points
/etc/crontab         # Scheduled tasks
```

Text-based configurations allow easy backup and version control.

---

**Q54. What does the 'cat' command do?**
- A) Categorizes files
- B) Concatenates and displays file contents
- C) Creates archives
- D) Counts words

**Answer: B) Concatenates and displays file contents**

**Explanation:** 
cat (concatenate):
- Display file contents to stdout
- Combine multiple files
- Create files (with redirection)

Examples:
```bash
cat file.txt                      # Display file
cat file1.txt file2.txt           # Display multiple files
cat file1.txt file2.txt > combined.txt  # Merge files
cat > newfile.txt                 # Create file (Ctrl+D to finish)
cat file.txt | less               # Page through large files
```

Related commands:
- **less**: Page through files (better for large files)
- **head**: Show first lines
- **tail**: Show last lines
- **tac**: Display in reverse

---

**Q55. What is the difference between absolute and relative paths?**
- A) No difference
- B) Absolute starts from /, relative starts from current directory
- C) Absolute is faster
- D) Relative is more secure

**Answer: B) Absolute starts from /, relative starts from current directory**

**Explanation:** 
**Absolute path**: Complete path from root
- Always starts with /
- Example: `/home/user/documents/file.txt`
- Works from any location
- Longer but unambiguous

**Relative path**: Path from current directory
- No leading /
- Example: `documents/file.txt` or `../other/file.txt`
- Shorter, context-dependent
- Uses . (current) and .. (parent)

Examples:
```bash
cd /home/user/documents           # Absolute
cd documents                       # Relative (if in /home/user)
cd ../pictures                     # Relative (parent then pictures)
cd ~/documents                     # ~ expands to home directory
```

---

**Q56. What does the 'pwd' command show?**
- A) Password of current user
- B) Print working directory (current directory path)
- C) Power status
- D) Previous working directory

**Answer: B) Print working directory (current directory path)**

**Explanation:** 
pwd (print working directory):
- Shows absolute path of current location
- No arguments needed
- Useful for orientation in filesystem

Example session:
```bash
$ pwd
/home/user/projects

$ cd documents
$ pwd
/home/user/projects/documents

$ cd ../..
$ pwd
/home/user
```

Useful in scripts to verify location:
```bash
if [ $(pwd) != "/expected/path" ]; then
  echo "Wrong directory!"
  exit 1
fi
```

---

**Q57. What is the purpose of the '.bashrc' file?**
- A) Stores deleted files
- B) Configuration file for Bash shell (runs on shell start)
- C) Backup of system files
- D) Binary cache

**Answer: B) Configuration file for Bash shell (runs on shell start)**

**Explanation:** 
.bashrc customizes Bash shell:
- Located in home directory (~/.bashrc)
- Executed for interactive non-login shells
- Hidden file (starts with .)

Common uses:
```bash
# Aliases
alias ll='ls -la'
alias gs='git status'

# Environment variables
export PATH=$PATH:/custom/path
export EDITOR=vim

# Custom functions
mkcd() {
  mkdir -p "$1" && cd "$1"
}

# Prompt customization
PS1='\u@\h:\w\$ '
```

Related files:
- **.bash_profile**: Login shells
- **.bashrc**: Interactive shells
- **.bash_aliases**: Separate alias file

After editing: `source ~/.bashrc` to reload

---

**Q58. What does 'chmod 777' do to a file?**
- A) Makes file read-only
- B) Gives all permissions (rwx) to everyone
- C) Deletes the file
- D) Locks the file

**Answer: B) Gives all permissions (rwx) to everyone**

**Explanation:** 
chmod 777 breakdown:
- First 7: Owner (rwx) = 4+2+1
- Second 7: Group (rwx) = 4+2+1
- Third 7: Others (rwx) = 4+2+1

Result: `-rwxrwxrwx`
- Everyone can read, write, and execute

⚠️ **Security risk!** Don't use 777 unless absolutely necessary:
- Anyone can modify or delete the file
- Security vulnerability
- Use least privilege principle

Better alternatives:
- **644**: Files (owner: rw, others: r)
- **755**: Executables (owner: rwx, others: rx)
- **600**: Private files (owner: rw only)

---

**Q59. What is the 'tail' command used for?**
- A) Removes end of file
- B) Displays last lines of a file
- C) Sorts files alphabetically
- D) Measures file size

**Answer: B) Displays last lines of a file**

**Explanation:** 
tail shows end of files:
- Default: Last 10 lines
- Opposite of `head` command

Examples:
```bash
tail file.txt                     # Last 10 lines
tail -n 20 file.txt              # Last 20 lines
tail -n +5 file.txt              # From line 5 to end
tail -f log.txt                  # Follow mode (live updates)
tail -f /var/log/syslog          # Monitor log in real-time
```

**tail -f** is extremely useful:
- Monitor logs as they're written
- Debugging applications
- Press Ctrl+C to stop following

Combined with grep:
```bash
tail -f app.log | grep "ERROR"   # Watch for errors in real-time
```

---

**Q60. What does the 'df' command show?**
- A) Directory files
- B) Disk filesystem usage and available space
- C) Deleted files
- D) Default files

**Answer: B) Disk filesystem usage and available space**

**Explanation:** 
df (disk free) shows:
- Filesystem usage per partition
- Available space
- Mount points

Examples:
```bash
df                                # Basic output (blocks)
df -h                            # Human-readable (GB, MB)
df -h /home                      # Specific filesystem
```

Output:
```
Filesystem      Size  Used Avail Use% Mounted on
/dev/sda1       100G   45G   50G  48% /
/dev/sdb1       500G  200G  275G  42% /data
```

Related commands:
- **du**: Disk usage by directory/file
- **du -sh */**: Size of each directory
- **du -h --max-depth=1**: One level deep

Use case: Check if disk is full before operations.

---

## Section 5: Software Testing Basics - 15 Questions

**Q61. What is the main goal of software testing?**
- A) To prove the software has no bugs
- B) To find defects and ensure quality
- C) To delay project delivery
- D) To increase development costs

**Answer: B) To find defects and ensure quality**

**Explanation:** 
Software testing aims to:
- **Find bugs** before users do
- **Verify** software meets requirements
- **Validate** it solves user problems
- **Prevent** defects from reaching production
- **Build confidence** in software quality

Important: Testing can show presence of bugs, not their absence (impossible to test everything)

Benefits:
- Reduces cost (fixing bugs early is cheaper)
- Improves user satisfaction
- Prevents reputation damage
- Ensures reliability

Testing is not about perfection—it's about risk management.

---

**Q62. What is the difference between verification and validation?**
- A) They are the same
- B) Verification: "Are we building it right?", Validation: "Are we building the right thing?"
- C) Verification is manual, validation is automated
- D) Verification is for code, validation is for documentation

**Answer: B) Verification: "Are we building it right?", Validation: "Are we building the right thing?"**

**Explanation:** 
**Verification:**
- Building product correctly
- Following specifications
- Reviews, inspections, walkthroughs
- Static testing (no code execution)
- Example: Code review checks if code follows design

**Validation:**
- Building the right product
- Meets user needs
- Testing actual software
- Dynamic testing (executing code)
- Example: UAT confirms software solves business problem

Analogy:
- Verification: Following recipe correctly
- Validation: Dish tastes good to customer

---

**Q63. What is a test case?**
- A) A container for storing tests
- B) A set of conditions to verify a feature works correctly
- C) A bug report
- D) A type of software

**Answer: B) A set of conditions to verify a feature works correctly**

**Explanation:** 
Test case components:
1. **Test ID**: Unique identifier
2. **Description**: What is being tested
3. **Preconditions**: Setup required
4. **Test Steps**: Actions to perform
5. **Expected Result**: What should happen
6. **Actual Result**: What actually happened
7. **Status**: Pass/Fail

Example test case:
```
ID: TC_LOGIN_001
Description: Verify login with valid credentials
Preconditions: User account exists
Steps:
  1. Navigate to login page
  2. Enter username: "testuser"
  3. Enter password: "Test123!"
  4. Click "Login" button
Expected: User redirected to dashboard
Actual: [To be filled during execution]
Status: [Pass/Fail]
```

---

**Q64. What is regression testing?**
- A) Testing old legacy systems
- B) Re-testing after changes to ensure existing functionality still works
- C) Testing software backwards
- D) Reducing number of tests

**Answer: B) Re-testing after changes to ensure existing functionality still works**

**Explanation:** 
Regression testing ensures:
- New code doesn't break existing features
- Bug fixes don't introduce new bugs
- Changes in one module don't affect others

When to run:
- After bug fixes
- After new features added
- Before releases
- After code refactoring

Automation is crucial:
- Regression tests run frequently
- Manual regression is time-consuming
- CI/CD pipelines automate regression testing

Example: After adding shopping cart feature, verify login, search, and checkout still work.

---

**Q65. What is the difference between black box and white box testing?**
- A) Black box uses black background, white box uses white
- B) Black box tests functionality without code knowledge, white box tests internal structure
- C) Black box is automated, white box is manual
- D) They are the same

**Answer: B) Black box tests functionality without code knowledge, white box tests internal structure**

**Explanation:** 
**Black Box Testing:**
- Tests **what** software does (functionality)
- No code access needed
- Based on requirements/specifications
- Tester perspective: End user
- Techniques: Equivalence partitioning, boundary value analysis
- Example: Enter invalid email, verify error message

**White Box Testing:**
- Tests **how** software works (internal logic)
- Requires code access
- Based on code structure
- Tester perspective: Developer
- Techniques: Statement coverage, branch coverage
- Example: Ensure all if-else branches executed

**Gray Box Testing:**
- Combination of both
- Partial code knowledge
- Example: Database testing with SQL knowledge

---

**Q66. What are functional requirements vs non-functional requirements?**
- A) No difference
- B) Functional: what system does, Non-functional: how well it performs
- C) Functional for users, non-functional for developers
- D) Functional is required, non-functional is optional

**Answer: B) Functional: what system does, Non-functional: how well it performs**

**Explanation:** 
**Functional Requirements:**
- **What** the system should do
- Specific behaviors and functions
- Example: "User can reset password via email"
- Example: "System calculates tax based on location"

**Non-Functional Requirements:**
- **How well** the system performs
- Quality attributes
- Examples:
  - Performance: "Page loads in <2 seconds"
  - Security: "Passwords encrypted with AES-256"
  - Usability: "3 clicks max to checkout"
  - Scalability: "Handle 10,000 concurrent users"
  - Availability: "99.9% uptime"

Both are equally important—working feature that's too slow is still a problem.

---

**Q67. What is exploratory testing?**
- A) Testing in different geographical locations
- B) Simultaneous learning, test design, and execution without predefined test cases
- C) Testing new features only
- D) Automated testing

**Answer: B) Simultaneous learning, test design, and execution without predefined test cases**

**Explanation:** 
Exploratory Testing characteristics:
- **Unscripted**: No predefined test cases
- **Creative**: Tester explores application freely
- **Adaptive**: Tests evolve based on findings
- **Experience-based**: Relies on tester's skill
- **Complementary**: Used alongside scripted testing

Process:
1. Charter: Define what to explore
2. Time-box: Set testing duration (e.g., 90 minutes)
3. Explore: Interact with software, take notes
4. Debrief: Document findings

Benefits:
- Finds unexpected bugs
- Quick feedback
- Human insight (not just checklist)
- Good for new or changing features

Not replacement for structured testing—it's complementary.

---

**Q68. What is a bug severity vs bug priority?**
- A) They are the same
- B) Severity: impact on system, Priority: urgency to fix
- C) Severity is for developers, priority is for testers
- D) Severity is a number, priority is a word

**Answer: B) Severity: impact on system, Priority: urgency to fix**

**Explanation:** 
**Severity** (Technical Impact):
- Critical: System crash, data loss
- High: Major feature broken
- Medium: Feature partially works
- Low: Cosmetic issues, typos

**Priority** (Business Urgency):
- P1: Fix immediately
- P2: Fix in next release
- P3: Fix when possible
- P4: Fix if time permits

Examples:
- **High Severity, High Priority**: Payment processing fails
- **High Severity, Low Priority**: Crash in rarely-used admin feature
- **Low Severity, High Priority**: CEO's name misspelled on homepage
- **Low Severity, Low Priority**: Button alignment in help page

Priority is set by business/product team, severity by technical team.

---

**Q69. What is smoke testing?**
- A) Testing in smoky environment
- B) Quick basic tests to check if build is stable enough for detailed testing
- C) Performance testing under load
- D) Testing fire safety systems

**Answer: B) Quick basic tests to check if build is stable enough for detailed testing**

**Explanation:** 
Smoke Testing (Build Verification Testing):
- **Quick checks** of critical functionality
- **First line of defense** after new build
- **Go/No-Go decision**: Is build testable?
- **Shallow and wide**: Covers many features briefly

Example smoke tests:
- Application launches
- User can login
- Main pages load
- Database connection works
- Critical APIs respond

If smoke tests fail → reject build, don't waste time on detailed testing

Origin: Hardware testing—turn on device, if it smokes, it's broken!

Smoke test (15 min) → Sanity test (1 hour) → Full test suite (days)

---

**Q70. What is the purpose of a test plan?**
- A) To list all bugs
- B) Document testing strategy, scope, resources, and schedule
- C) To write test cases
- D) To track project deadlines

**Answer: B) Document testing strategy, scope, resources, and schedule**

**Explanation:** 
Test Plan contents:
1. **Scope**: What will/won't be tested
2. **Objectives**: Testing goals
3. **Resources**: People, tools, environments
4. **Schedule**: Timeline and milestones
5. **Strategy**: Testing approach and types
6. **Entry/Exit Criteria**: When to start/stop testing
7. **Risks**: Potential issues and mitigation
8. **Deliverables**: Test reports, metrics

Purpose:
- Provides direction for testing team
- Aligns stakeholders on approach
- Documents decisions
- Basis for estimating time and resources

Created early in project, updated as needed
Not same as test cases (plan is strategy, cases are tactics).

---

**Q71. What is boundary value analysis?**
- A) Testing at country borders
- B) Testing at edges of input ranges where errors often occur
- C) Testing limit of system capacity
- D) Testing network boundaries

**Answer: B) Testing at edges of input ranges where errors often occur**

**Explanation:** 
Boundary Value Analysis (BVA):
- Tests values at **boundaries** and **just outside boundaries**
- Most bugs occur at edges of ranges
- Black box testing technique

Example: Age field accepts 18-65
Test values:
- 17 (just below minimum) ❌
- 18 (minimum) ✓
- 19 (just above minimum) ✓
- 41 (middle) ✓
- 64 (just below maximum) ✓
- 65 (maximum) ✓
- 66 (just above maximum) ❌

Why effective:
- Programmers often use wrong operators (< vs <=)
- Off-by-one errors common
- Tests edge cases users might try

More efficient than testing all values in range.

---

**Q72. What is test automation?**
- A) Tests that run themselves
- B) Using tools and scripts to execute tests automatically
- C) Letting AI test software
- D) Testing robots

**Answer: B) Using tools and scripts to execute tests automatically**

**Explanation:** 
Test Automation:
- Write scripts to execute tests
- Tools run tests automatically
- Compare actual vs expected results
- Generate test reports

Benefits:
- **Faster execution**: Run overnight, no human needed
- **Consistent**: Same tests every time
- **Repeatable**: Good for regression testing
- **Scalable**: Can run on multiple environments
- **Cost-effective long-term**: Initial investment pays off

When to automate:
- ✓ Repetitive tests (regression)
- ✓ Stable functionality
- ✓ Multiple data sets
- ✗ Tests that change frequently
- ✗ Exploratory testing
- ✗ One-time tests

Tools: Selenium, Cypress, JUnit, pytest, TestNG

Automation doesn't replace manual testing—they complement each other.

---

**Q73. What is UAT (User Acceptance Testing)?**
- A) Universal Application Test
- B) End users verify system meets business requirements
- C) Automated testing by developers
- D) Unit acceptance testing

**Answer: B) End users verify system meets business requirements**

**Explanation:** 
UAT characteristics:
- **Last phase** before production release
- **Performed by** actual end users or business stakeholders
- **Focus**: Business requirements, not technical specs
- **Real scenarios**: Actual workflows and use cases

Purpose:
- Validate software solves business problems
- Ensure usability for target audience
- Build user confidence
- Sign-off for production release

Types of UAT:
- **Alpha testing**: Internal users at development site
- **Beta testing**: External users in their environment
- **Contract acceptance**: Verify contractual requirements

Example: HR system UAT by HR staff testing actual hiring workflow

If UAT fails, software goes back for fixes before release.

---

**Q74. What is performance testing?**
- A) Testing how fast developers code
- B) Testing system behavior under load and stress
- C) Testing employee performance
- D) Testing hardware speed

**Answer: B) Testing system behavior under load and stress**

**Explanation:** 
Performance Testing types:

**Load Testing:**
- Expected user load
- Example: 1,000 concurrent users
- Measures: Response time, throughput

**Stress Testing:**
- Beyond capacity until failure
- Find breaking point
- Example: Keep increasing users until crash

**Spike Testing:**
- Sudden traffic increase
- Example: Black Friday sale

**Endurance Testing (Soak):**
- Sustained load over time
- Find memory leaks, degradation
- Example: Run for 72 hours

Metrics measured:
- Response time
- Throughput (requests/second)
- Resource utilization (CPU, memory)
- Error rate

Tools: JMeter, LoadRunner, Gatling

---

**Q75. What is a defect life cycle?**
- A) How long bugs live in code
- B) The stages a bug goes through from discovery to closure
- C) Testing lifecycle
- D) Product lifecycle

**Answer: B) The stages a bug goes through from discovery to closure**

**Explanation:** 
Defect Life Cycle states:

1. **New**: Bug reported
2. **Assigned**: Given to developer
3. **Open**: Developer working on it
4. **Fixed**: Developer completed fix
5. **Retest**: QA verifies fix
6. **Verified**: QA confirms fixed
7. **Closed**: Bug resolved

Alternative paths:
- **Rejected**: Not a bug (working as designed)
- **Duplicate**: Already reported
- **Deferred**: Fix postponed to future release
- **Reopened**: Fix didn't work, back to developer

Tracking in tools:
- Jira, Bugzilla, Azure DevOps
- Tracks history, comments, attachments
- Provides metrics (bugs found/fixed rate)

Good defect reports include:
- Steps to reproduce
- Expected vs actual result
- Screenshots/logs
- Environment details

---

## Section 6: SDLC & STLC - 15 Questions

**Q76. What does SDLC stand for?**
- A) Software Design Life Cycle
- B) Software Development Life Cycle
- C) System Development Linear Cycle
- D) Software Delivery Life Cycle

**Answer: B) Software Development Life Cycle**

**Explanation:** 
SDLC is a structured process for software development:

Phases:
1. **Planning**: Define scope, feasibility
2. **Requirements**: Gather and document needs
3. **Design**: Architecture and UI/UX design
4. **Development**: Write code
5. **Testing**: Find and fix bugs
6. **Deployment**: Release to users
7. **Maintenance**: Support and updates

Benefits:
- Reduces risks
- Improves quality
- Better project management
- Clear deliverables per phase
- Stakeholder alignment

Different models: Waterfall, Agile, Spiral, V-Model (each organizes these phases differently)

---

**Q77. What is the Waterfall model?**
- A) Testing near waterfalls
- B) Sequential model where each phase must complete before next begins
- C) Agile methodology
- D) Cloud deployment model

**Answer: B) Sequential model where each phase must complete before next begins**

**Explanation:** 
Waterfall characteristics:
- **Linear and sequential**: Like a waterfall flowing down
- **Phase completion**: Each phase must finish before next
- **Documentation heavy**: Extensive docs at each stage
- **No going back**: Hard to make changes

Phases flow:
Requirements → Design → Implementation → Testing → Deployment → Maintenance

**Advantages:**
- Simple to understand
- Well-documented
- Good for stable requirements
- Clear milestones

**Disadvantages:**
- Inflexible to changes
- Late testing (bugs found late)
- No working software until end
- High risk for complex projects

Best for:
- Well-defined requirements
- Short projects
- Regulatory/contractual projects

---

**Q78. What is Agile methodology?**
- A) Fast coding technique
- B) Iterative approach with frequent releases and continuous feedback
- C) Testing methodology
- D) Project management software

**Answer: B) Iterative approach with frequent releases and continuous feedback**

**Explanation:** 
Agile principles:
- **Iterative development**: Small increments (sprints)
- **Frequent delivery**: Working software every 2-4 weeks
- **Customer collaboration**: Continuous feedback
- **Embrace change**: Adapt to changing requirements
- **Self-organizing teams**: Empowered to make decisions

Agile Manifesto values:
- Individuals over processes
- Working software over documentation
- Customer collaboration over contracts
- Responding to change over following plans

Popular frameworks:
- **Scrum**: Sprints, daily standups, retrospectives
- **Kanban**: Visual workflow, continuous delivery
- **XP** (Extreme Programming): Pair programming, TDD

Benefits:
- Faster time to market
- Better quality (continuous testing)
- Higher customer satisfaction
- Team flexibility

---

**Q79. What is the V-Model?**
- A) Version control model
- B) Verification and Validation model where each dev phase has corresponding test phase
- C) Visual modeling tool
- D) Variable model

**Answer: B) Verification and Validation model where each dev phase has corresponding test phase**

**Explanation:** 
V-Model structure (V shape):

**Left side (Development):**
- Requirements → Acceptance Test Planning
- System Design → System Test Planning
- Architecture → Integration Test Planning
- Module Design → Unit Test Planning
- **Coding** (bottom of V)

**Right side (Testing):**
- Unit Testing
- Integration Testing
- System Testing
- Acceptance Testing

Key principle: Test planning happens alongside development

**Advantages:**
- Simple and easy to use
- Testing planned early
- Clear deliverables
- Works well for small-medium projects

**Disadvantages:**
- Rigid like Waterfall
- Not good for changing requirements
- No early prototypes
- High risk for complex projects

Best for: Safety-critical systems (medical, aerospace)

---

**Q80. What is a Sprint in Scrum?**
- A) Fast running competition
- B) Fixed time period (1-4 weeks) for completing set of work
- C) Emergency bug fix
- D) Performance optimization

**Answer: B) Fixed time period (1-4 weeks) for completing set of work**

**Explanation:** 
Sprint characteristics:
- **Fixed duration**: Usually 2 weeks (1-4 weeks typical)
- **Time-boxed**: Doesn't extend if work incomplete
- **Goal-oriented**: Specific sprint objective
- **Results in increment**: Potentially shippable product

Sprint events:
1. **Sprint Planning** (start): Select work, define goal
2. **Daily Scrum** (daily): 15-minute standup
3. **Sprint Review** (end): Demo completed work
4. **Sprint Retrospective** (end): Team improvement discussion

During sprint:
- Team commits to work
- No scope changes (protect team focus)
- Product Owner available for clarification
- Work completed according to Definition of Done

After sprint: Potentially shippable increment ready

---

**Q81. What is STLC (Software Testing Life Cycle)?**
- A) Software Technology Life Cycle
- B) Systematic testing process with defined phases
- C) Same as SDLC
- D) Testing tools lifecycle

**Answer: B) Systematic testing process with defined phases**

**Explanation:** 
STLC phases:

1. **Requirement Analysis**:
   - Understand requirements
   - Identify testable aspects
   - Determine test priorities

2. **Test Planning**:
   - Define strategy and approach
   - Estimate effort and resources
   - Identify risks

3. **Test Design**:
   - Create test cases
   - Prepare test data
   - Design test scenarios

4. **Test Environment Setup**:
   - Configure test environments
   - Install necessary software
   - Prepare test data

5. **Test Execution**:
   - Run test cases
   - Log defects
   - Retest bug fixes

6. **Test Closure**:
   - Evaluate test completion
   - Document lessons learned
   - Archive test artifacts

STLC runs parallel to SDLC, not after it.

---

**Q82. What is Continuous Integration (CI)?**
- A) Integrating customer feedback
- B) Automatically building and testing code when developers commit changes
- C) Merging code once a week
- D) Team building activities

**Answer: B) Automatically building and testing code when developers commit changes**

**Explanation:** 
Continuous Integration:
- **Frequent commits**: Multiple times per day
- **Automated build**: Triggered on each commit
- **Automated tests**: Run automatically
- **Immediate feedback**: Developers notified of failures

CI workflow:
1. Developer commits code
2. CI server detects change
3. Build runs automatically
4. Tests execute
5. Results reported (pass/fail)
6. If fail, fix immediately

Benefits:
- **Early bug detection**: Caught within minutes
- **Reduced integration problems**: Small, frequent integrations
- **Faster development**: Quick feedback loop
- **Improved quality**: Automated testing

Tools: Jenkins, GitHub Actions, CircleCI, GitLab CI, Travis CI

Key principle: "If it hurts, do it more often" (integrate frequently to reduce pain)

---

**Q83. What is the difference between alpha and beta testing?**
- A) No difference
- B) Alpha: internal testing at dev site, Beta: external testing in user environment
- C) Alpha is automated, beta is manual
- D) Alpha for mobile, beta for web

**Answer: B) Alpha: internal testing at dev site, Beta: external testing in user environment**

**Explanation:** 
**Alpha Testing:**
- **Where**: Developer's location
- **Who**: Internal teams (developers, QA)
- **When**: Before release to external users
- **Environment**: Lab/controlled setting
- **Focus**: Functionality, major bugs
- **Controlled**: Supervised testing

**Beta Testing:**
- **Where**: User's actual environment
- **Who**: Selected external users
- **When**: After alpha, before public release
- **Environment**: Real-world conditions
- **Focus**: Usability, compatibility, rare bugs
- **Uncontrolled**: Users test naturally

Types of beta:
- **Closed beta**: Invited users only
- **Open beta**: Public participation

Example: Game studios run closed beta for pre-orders, open beta for general public.

---

**Q84. What is a Product Backlog in Agile?**
- A) List of bugs
- B) Prioritized list of features and requirements for the product
- C) Completed work log
- D) Team member assignments

**Answer: B) Prioritized list of features and requirements for the product**

**Explanation:** 
Product Backlog:
- **Living document**: Constantly updated
- **Prioritized**: Most important items at top
- **Owned by**: Product Owner
- **Contains**: User stories, features, bug fixes, technical tasks

User Story format:
```
As a [user type],
I want [functionality],
So that [benefit].

Example:
As a customer,
I want to save items to wishlist,
So that I can purchase them later.
```

Backlog items include:
- Acceptance criteria (Definition of Done)
- Estimate (story points)
- Priority/ordering

Grooming/Refinement:
- Regular review and updating
- Adding details to upcoming items
- Re-prioritizing based on feedback

Sprint Planning pulls items from top of backlog.

---

**Q85. What is Definition of Done (DoD)?**
- A) Project completion date
- B) Agreed criteria that work must meet to be considered complete
- C) List of finished features
- D) End of sprint

**Answer: B) Agreed criteria that work must meet to be considered complete**

**Explanation:** 
Definition of Done checklist example:
- ✓ Code written and reviewed
- ✓ Unit tests written and passing
- ✓ Integration tests passing
- ✓ Code merged to main branch
- ✓ Documentation updated
- ✓ Acceptance criteria met
- ✓ No critical bugs
- ✓ Deployed to staging environment
- ✓ Product Owner accepted

Purpose:
- **Shared understanding**: Team agrees on "done"
- **Quality gate**: Prevents incomplete work
- **Transparency**: Clear what complete means
- **Prevents technical debt**: All tasks properly finished

Different levels:
- Feature DoD
- Sprint DoD
- Release DoD

Without DoD, "done" is subjective and leads to problems.

---

**Q86. What is a Daily Standup (Daily Scrum)?**
- A) Morning exercise
- B) Brief daily team meeting to synchronize work
- C) Daily status report to management
- D) Code review session

**Answer: B) Brief daily team meeting to synchronize work**

**Explanation:** 
Daily Standup format:
- **Duration**: 15 minutes maximum
- **Time**: Same time every day
- **Attendance**: Development team (mandatory), Product Owner & Scrum Master (optional)
- **Standing**: Yes, keeps it short

Each team member answers:
1. What did I complete yesterday?
2. What will I work on today?
3. Any blockers/impediments?

**What it's NOT:**
- Status report to manager
- Problem-solving session (take offline)
- Planning meeting

Benefits:
- **Team synchronization**: Everyone knows what others are doing
- **Early problem detection**: Blockers surfaced quickly
- **Accountability**: Public commitment to daily work
- **Quick**: Doesn't disrupt flow

Scrum Master removes blockers after meeting.

---

**Q87. What is Pair Programming?**
- A) Two developers working on separate tasks together
- B) Two developers working on same code at one workstation
- C) Reviewing code after completion
- D) Testing with another tester

**Answer: B) Two developers working on same code at one workstation**

**Explanation:** 
Pair Programming roles:
- **Driver**: Writes code, tactical thinking
- **Navigator**: Reviews, thinks strategically, suggests improvements
- **Switch frequently**: Swap roles every 15-30 minutes

Benefits:
- **Higher quality**: Immediate review, fewer bugs
- **Knowledge sharing**: Both learn from each other
- **Better design**: Two perspectives
- **Reduced blockers**: Help each other immediately
- **Team cohesion**: Builds collaboration

Concerns addressed:
- "Twice the cost?": No, produces better code faster (fewer bugs)
- "Slower?": Initial code slower, but less rework later
- "Personality clashes?": Rotate pairs regularly

Part of Extreme Programming (XP) methodology

Not required all the time—use for:
- Complex features
- Onboarding new team members
- Critical code sections

---

**Q88. What is Technical Debt?**
- A) Money owed to vendors
- B) Shortcuts in code that will require rework later
- C) Missing documentation
- D) Unpaid software licenses

**Answer: B) Shortcuts in code that will require rework later**

**Explanation:** 
Technical Debt types:

**Deliberate debt:**
- Conscious decision to ship faster
- Plan to refactor later
- Example: "Use simple solution now, optimize later"

**Accidental debt:**
- Poor code due to lack of skill/knowledge
- Unintentional shortcuts
- Example: Not knowing better design patterns

Consequences:
- Slower feature development over time
- More bugs
- Harder to maintain
- Decreased morale

Managing technical debt:
- **Track it**: Document known issues
- **Prioritize**: Not all debt needs immediate fixing
- **Allocate time**: Budget sprints for paying down debt
- **Balance**: New features vs. technical improvements

Metaphor: Like financial debt, some is okay, but too much is dangerous.

Prevention: Code reviews, pair programming, automated testing

---

**Q89. What is the Spiral model in SDLC?**
- A) Circular testing approach
- B) Risk-driven iterative model combining waterfall and prototyping
- C) Agile variant
- D) Documentation model

**Answer: B) Risk-driven iterative model combining waterfall and prototyping**

**Explanation:** 
Spiral Model characteristics:
- **Risk-driven**: Focus on identifying and mitigating risks
- **Iterative**: Multiple cycles (spirals)
- **Combines**: Waterfall structure + iterative prototyping

Each spiral has 4 phases:
1. **Planning**: Determine objectives, constraints
2. **Risk Analysis**: Identify and evaluate risks, build prototypes
3. **Engineering**: Develop and test
4. **Evaluation**: Customer reviews, plan next spiral

**Advantages:**
- Risk management built-in
- Good for large, complex projects
- Early user feedback via prototypes
- Accommodates changes

**Disadvantages:**
- Expensive (risk analysis costs)
- Requires expertise in risk assessment
- Can be lengthy
- Success depends on risk analysis

Best for:
- Large, expensive projects
- High-risk projects
- Projects with unclear requirements

Example: NASA space missions, large defense systems

---

**Q90. What is a retrospective in Agile?**
- A) Looking back at old code
- B) Team meeting to reflect on sprint and identify improvements
- C) Review of project history
- D) Retirement party

**Answer: B) Team meeting to reflect on sprint and identify improvements**

**Explanation:** 
Sprint Retrospective:
- **When**: End of every sprint
- **Duration**: 1-3 hours (depends on sprint length)
- **Attendees**: Development team (mandatory), Scrum Master facilitates
- **Focus**: Process improvement, not blame

Discussion topics:
1. What went well?
2. What didn't go well?
3. What should we improve?

Format examples:
- **Start, Stop, Continue**: What to start/stop/continue doing
- **Mad, Sad, Glad**: Emotional retrospective
- **4Ls**: Liked, Learned, Lacked, Longed for

Output:
- **Action items**: Concrete improvements for next sprint
- **One or two** key improvements (don't overload)
- **Owner assigned**: Who will implement

Key principle: **Continuous improvement**

Safe environment: Psychological safety crucial for honest feedback

Different from Sprint Review (demo to stakeholders vs. internal team reflection)

---

## Section 7: Testing Levels & Methodologies - 10 Questions

**Q91. What is Unit Testing?**
- A) Testing whole system
- B) Testing individual components/functions in isolation
- C) Testing user interface
- D) Testing with users

**Answer: B) Testing individual components/functions in isolation**

**Explanation:** 
Unit Testing characteristics:
- **Scope**: Smallest testable part (function, method, class)
- **Who**: Developers (not separate QA)
- **When**: During development
- **Automated**: Part of build process
- **Fast**: Runs in milliseconds
- **Isolated**: Uses mocks/stubs for dependencies

Example:
```python
def add(a, b):
    return a + b

# Unit test
def test_add():
    assert add(2, 3) == 5
    assert add(-1, 1) == 0
    assert add(0, 0) == 0
```

Benefits:
- Find bugs early (cheapest to fix)
- Document code behavior
- Enable refactoring (confidence code still works)
- Faster debugging (pinpoint exact issue)

Frameworks: JUnit (Java), pytest (Python), Jest (JavaScript), NUnit (.NET)

Goal: 70-80% code coverage for critical code

---

**Q92. What is Integration Testing?**
- A) Testing user integration
- B) Testing interaction between integrated components/modules
- C) Testing only APIs
- D) Testing database only

**Answer: B) Testing interaction between integrated components/modules**

**Explanation:** 
Integration Testing focuses on:
- **Interfaces** between modules
- **Data flow** between components
- **Module interactions**

Approaches:

**Big Bang:**
- Integrate all modules at once
- Fast to set up
- Hard to debug

**Incremental:**

*Top-Down:*
- Start with top-level modules
- Add lower modules gradually
- Use stubs for missing lower modules
- Tests high-level logic early

*Bottom-Up:*
- Start with low-level modules
- Add higher modules gradually
- Use drivers to call lower modules
- Tests foundation first

*Sandwich (Hybrid):*
- Combine top-down and bottom-up
- Test both ends simultaneously

Example: Testing login module (UI) with authentication service (backend) with database

Integration bugs: Incorrect API calls, data format mismatches, timing issues

---

**Q93. What is System Testing?**
- A) Testing operating system
- B) End-to-end testing of complete integrated system
- C) Testing system requirements
- D) Testing hardware

**Answer: B) End-to-end testing of complete integrated system**

**Explanation:** 
System Testing characteristics:
- **Scope**: Complete, integrated application
- **Environment**: Test environment mimicking production
- **Who**: Independent QA team
- **When**: After integration testing
- **Black box**: Tests against requirements, not code

Types of system testing:
- **Functional**: Features work correctly
- **Non-functional**: Performance, security, usability
- **Recovery**: System recovers from failures
- **Security**: Vulnerabilities, penetration testing
- **Stress**: Behavior under extreme load
- **Usability**: User experience

Example scenario:
```
E-commerce system test:
1. User registers account
2. Browses products
3. Adds to cart
4. Applies coupon
5. Checks out
6. Receives confirmation email
7. Admin views order
```

Validates: System as a whole meets requirements

Different from UAT (system testing = technical validation, UAT = business validation)

---

**Q94. What is Acceptance Testing (UAT)?**
- A) Accepting bugs in system
- B) Business users verify system meets requirements and is ready for production
- C) Automated testing
- D) Testing acceptance criteria

**Answer: B) Business users verify system meets requirements and is ready for production**

**Explanation:** 
UAT (User Acceptance Testing):
- **Final testing phase** before go-live
- **Performed by**: Actual end users or business stakeholders
- **Environment**: Production-like or actual production
- **Focus**: Business processes, not technical specs

UAT types:

**Alpha Testing:**
- Internal acceptance testing
- Controlled environment
- Developer site

**Beta Testing:**
- External acceptance testing
- User environment
- Limited release

**Contract Acceptance:**
- Verify contractual requirements
- Often legally binding
- Predefined acceptance criteria

**Operational Acceptance Testing:**
- Operations team tests backup, recovery, maintenance procedures

Example: HR tests new payroll system with real employee data

Sign-off: UAT approval required for production release

If UAT fails: Back to development

---

**Q95. What is Test-Driven Development (TDD)?**
- A) Testing drives project schedule
- B) Write tests before writing code
- C) Developers don't test
- D) Automated testing only

**Answer: B) Write tests before writing code**

**Explanation:** 
TDD cycle (Red-Green-Refactor):

1. **Red**: Write failing test for new feature
2. **Green**: Write minimum code to pass test
3. **Refactor**: Improve code while keeping tests passing

Process:
```
1. Write test → Test fails (Red)
2. Write code → Test passes (Green)
3. Refactor code → Test still passes
4. Repeat for next feature
```

Benefits:
- **Better design**: Think about interface before implementation
- **Test coverage**: All code has tests
- **Documentation**: Tests document behavior
- **Confidence**: Safe to refactor
- **Fewer bugs**: Issues caught immediately

Example:
```python
# 1. Write test first (Red)
def test_calculate_discount():
    assert calculate_discount(100, 10) == 90  # Fails - function doesn't exist

# 2. Write code (Green)
def calculate_discount(price, percent):
    return price - (price * percent / 100)  # Test passes

# 3. Refactor if needed
def calculate_discount(price, percent):
    return price * (1 - percent / 100)  # Cleaner, test still passes
```

Discipline required: Don't skip to implementation

---

**Q96. What is the Test Pyramid?**
- A) Ancient testing method
- B) Visual representation of test distribution: many unit tests, fewer UI tests
- C) Pyramid-shaped test lab
- D) Management hierarchy for testing

**Answer: B) Visual representation of test distribution: many unit tests, fewer UI tests**

**Explanation:** 
Test Pyramid levels (bottom to top):

**Base (70%): Unit Tests**
- Largest number
- Fastest execution
- Cheapest to maintain
- High coverage

**Middle (20%): Integration Tests**
- Moderate number
- Moderate speed
- Test module interactions

**Top (10%): End-to-End/UI Tests**
- Fewest tests
- Slowest execution
- Most expensive to maintain
- Brittle (break easily)

Rationale:
- Unit tests catch most bugs
- Faster feedback
- Easier to debug
- Lower maintenance

Anti-pattern (Ice Cream Cone):
- Too many slow UI tests
- Few unit tests
- Slow, brittle test suite

Good pyramid:
- 70% unit
- 20% integration
- 10% E2E

Balances speed, coverage, and confidence.

---

**Q97. What is Behavior-Driven Development (BDD)?**
- A) Testing user behavior
- B) Collaborative approach using natural language to describe features
- C) Psychology-based testing
- D) Behavioral analysis

**Answer: B) Collaborative approach using natural language to describe features**

**Explanation:** 
BDD characteristics:
- **Collaboration**: Developers, testers, business work together
- **Ubiquitous language**: Technical and non-technical understand
- **Focuses on behavior**: What system should do, not how

Gherkin syntax (Given-When-Then):
```gherkin
Feature: Shopping Cart
  
  Scenario: Apply discount coupon
    Given I have items worth $100 in cart
    When I apply coupon "SAVE10"
    Then total should be $90
    And discount of $10 should be displayed
```

Tools: Cucumber, SpecFlow, Behave

BDD process:
1. **Discovery**: Discuss and understand requirements
2. **Formulation**: Write scenarios in Gherkin
3. **Automation**: Implement step definitions (code)
4. **Execution**: Run tests

Benefits:
- **Living documentation**: Tests describe features
- **Shared understanding**: Everyone speaks same language
- **Requirements clarity**: Forces concrete examples
- **Executable specifications**: Tests are requirements

Difference from TDD:
- TDD: Developer-focused, code level
- BDD: Team-focused, behavior level

---

**Q98. What is Smoke Testing vs Sanity Testing?**
- A) Same thing
- B) Smoke: basic functionality, Sanity: specific functionality after changes
- C) Smoke is automated, sanity is manual
- D) Smoke for hardware, sanity for software

**Answer: B) Smoke: basic functionality, Sanity: specific functionality after changes**

**Explanation:** 
**Smoke Testing:**
- **When**: After receiving new build
- **Scope**: Wide but shallow (major features)
- **Purpose**: Is build stable enough to test?
- **Documented**: Usually has test cases
- **Time**: 15-30 minutes
- **Go/No-Go decision**: Accept or reject build

Example smoke tests:
- Application launches
- Login works
- Main pages load
- Critical workflows function

**Sanity Testing:**
- **When**: After bug fixes or minor changes
- **Scope**: Narrow but deep (specific functionality)
- **Purpose**: Does specific fix work? Did it break related features?
- **Documented**: Often not documented (ad-hoc)
- **Time**: 1-2 hours
- **Subset**: Of regression testing

Example sanity tests:
After login bug fix:
- Login with valid credentials
- Login with invalid credentials
- Password reset
- Session timeout

Comparison:
| Aspect | Smoke | Sanity |
|--------|-------|--------|
| Scope | Wide | Narrow |
| Depth | Shallow | Deep |
| Documented | Yes | Optional |
| Who | Developers/QA | QA |

Both are subsets of regression testing.

---

**Q99. What is the difference between manual and automated testing?**
- A) No difference
- B) Manual: humans execute tests, Automated: tools execute tests
- C) Manual is better
- D) Automated is always preferred

**Answer: B) Manual: humans execute tests, Automated: tools execute tests**

**Explanation:** 
**Manual Testing:**
**Pros:**
- Human intuition and creativity
- Good for exploratory testing
- Finds usability issues
- Ad-hoc scenarios
- Immediate feedback on UI/UX
- Lower initial cost

**Cons:**
- Time-consuming
- Human error prone
- Not repeatable consistently
- Can't run overnight
- Boring for repetitive tests

**Automated Testing:**
**Pros:**
- Fast execution
- Consistent and repeatable
- Can run 24/7
- Good for regression
- Long-term cost effective
- Early bug detection (CI/CD)

**Cons:**
- High initial investment
- Maintenance required
- Can't find unexpected issues
- Limited exploratory capability
- Tool limitations

When to use each:

**Manual:**
- ✓ Exploratory testing
- ✓ Usability testing
- ✓ Ad-hoc testing
- ✓ New features (unstable)
- ✓ One-time tests

**Automated:**
- ✓ Regression testing
- ✓ Smoke testing
- ✓ Data-driven testing (multiple data sets)
- ✓ Stable functionality
- ✓ Repeated execution

Best approach: Combination of both (right tool for right job)

---

**Q100. What are common QA interview questions?**
- A) Only technical coding questions
- B) Mix of testing concepts, scenarios, and problem-solving
- C) Only about salary expectations
- D) Only behavioral questions

**Answer: B) Mix of testing concepts, scenarios, and problem-solving**

**Explanation:** 
Common QA interview categories:

**1. Testing Fundamentals:**
- What is software testing?
- Difference between QA and QC?
- What is a test case?
- Explain test plan vs test strategy

**2. Testing Types:**
- Functional vs non-functional testing?
- What is regression testing?
- When to use smoke vs sanity testing?
- Explain exploratory testing

**3. SDLC/STLC:**
- Explain Agile methodology
- What is V-Model?
- Phases of STLC?
- What is a sprint retrospective?

**4. Defect Management:**
- Bug life cycle?
- Severity vs priority?
- How to write a good bug report?

**5. Practical Scenarios:**
- "Test a pen" / "Test an elevator"
- "Find bugs in this login page"
- "Design tests for search feature"
- "How would you test a mobile app?"

**6. Tools & Technologies:**
- Selenium, JMeter, Postman experience
- SQL queries for test data
- API testing experience
- CI/CD pipeline knowledge

**7. Behavioral:**
- Describe challenging bug you found
- Disagreement with developer scenario
- How do you prioritize testing?
- Working under tight deadlines

**Preparation tips:**
- Know STLC phases thoroughly
- Understand different testing types
- Practice writing test cases
- Prepare real examples from experience
- Study SQL basics
- Know testing tools

Interview format: Usually 45-60 min with mix of theoretical and practical questions.

---

## Answer Key Summary

**Section 1 (Database): 1-15**
1-A, 2-D, 3-B, 4-B, 5-B, 6-C, 7-D, 8-B, 9-C, 10-D, 11-A, 12-B, 13-B, 14-B, 15-B

**Section 2 (Query Practice): 16-30**
16-C, 17-D, 18-B, 19-B, 20-B, 21-B, 22-B, 23-B, 24-C, 25-A, 26-C, 27-B, 28-B, 29-B, 30-B

**Section 3 (Software Roles): 31-45**
31-C, 32-B, 33-B, 34-B, 35-B, 36-B, 37-B, 38-B, 39-C, 40-B, 41-B, 42-B, 43-B, 44-B, 45-B

**Section 4 (Linux): 46-60**
46-B, 47-B, 48-B, 49-B, 50-B, 51-B, 52-B, 53-B, 54-B, 55-B, 56-B, 57-B, 58-B, 59-B, 60-B

**Section 5 (Testing Basics): 61-75**
61-B, 62-B, 63-B, 64-B, 65-B, 66-B, 67-B, 68-B, 69-B, 70-B, 71-B, 72-B, 73-B, 74-B, 75-B

**Section 6 (SDLC & STLC): 76-90**
76-B, 77-B, 78-B, 79-B, 80-B, 81-B, 82-B, 83-B, 84-B, 85-B, 86-B, 87-B, 88-B, 89-B, 90-B

**Section 7 (Testing Levels): 91-100**
91-B, 92-B, 93-B, 94-B, 95-B, 96-B, 97-B, 98-B, 99-B, 100-B

---

## Scoring Guide

- **90-100**: Excellent! Ready for advanced topics
- **75-89**: Good understanding, review weak areas
- **60-74**: Fair knowledge, more study needed
- **Below 60**: Review all sections thoroughly

## Study Tips

1. **Don't just memorize**: Understand concepts
2. **Practice coding**: SQL queries, Linux commands
3. **Hands-on experience**: Set up test environments
4. **Real projects**: Apply knowledge practically
5. **Join communities**: QA forums, GitHub projects
6. **Stay updated**: Technologies evolve rapidly

Good luck with your learning! 🚀

```markdown
# HealeniumDemo

This is a Healenium web demo project using Java, Maven, and JUnit. It features a simple HTML web page and includes a Docker Compose file for integrating Healenium components.

## Getting Started

### Prerequisites

- Docker
- Java Development Kit (JDK)
- Maven

### Setup

1. **Navigate to the resources directory:**
   ```sh
   cd healenium-poc/src/main/resources
   ```

2. **Start Healenium components using Docker Compose:**
   ```sh
   docker-compose up -d
   ```

3. **Run the test code and verify that the tests pass.**

4. **Change an element in the `index.html` file.**

5. **Rerun the test to see the healing in action.**

6. **Check the report page:**
   [http://localhost:7878/healenium/report](http://localhost:7878/healenium/report)
```
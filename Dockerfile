
# Step 1: Use Maven with Java 17
FROM maven:3.9.9-eclipse-temurin-17

# Step 2: Set working directory
WORKDIR /app

# Step 3: Install Chromium and dependencies
RUN apt-get update && DEBIAN_FRONTEND=noninteractive apt-get install -y --no-install-recommends \
    chromium \
    libglib2.0-0 \
    libnss3 \
    libfontconfig1 \
    && rm -rf /var/lib/apt/lists/*

# Step 4: Copy project files
COPY pom.xml .
COPY src ./src

# Step 5: Download dependencies
RUN mvn dependency:go-offline -B

# Step 6: Configure Chrome
ENV CHROME_BIN=/usr/bin/chromium

# Step 7: Execute Selenium and TestNG tests
CMD ["mvn", "test"]

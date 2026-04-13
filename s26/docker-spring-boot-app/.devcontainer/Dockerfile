# Use latest
ARG VARIANT=latest
FROM mcr.microsoft.com/devcontainers/java  

# Install Maven
ARG MAVEN_VERSION="3.9.12"
RUN su vscode -c "source /usr/local/sdkman/bin/sdkman-init.sh && sdk install maven \"${MAVEN_VERSION}\""
FROM debian
RUN apt-get update && apt-get install -y sl
COPY tibet.sh /
RUN chmod +x /tibet.sh
ENTRYPOINT ["/tibet.sh"]

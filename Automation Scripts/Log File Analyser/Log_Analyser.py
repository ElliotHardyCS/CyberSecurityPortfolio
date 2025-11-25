from collections import Counter

def extract_ip(line):
  parts = line.split()
  if "from" in parts:
    index = parts.index("from")
    return parts[index + 1]
  return None

ipAdresses = []
fileName = input ("Enter the name of the file to analyse: ")
logs = open(fileName, "r")
lines = logs.readlines()
for line in lines:
  if "Failed password" in line:
    ipAdresses.append(extract_ip(line))

ip_counter = Counter(ipAdresses)

for ip, count in ipAdresses.items():
  if count >= 3:
    print ("Suspicious activity from ",ip," - ",count," failed access attempts")

logs.close()

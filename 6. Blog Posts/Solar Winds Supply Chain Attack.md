![SolarWinds](images/SolarWinds.webp)

In late 2020 one of the most sophisticated cyberattacks in history occured, The SolarWinds supply chain attack. This attack compromised thousands of organisations’ systems, including government agencies, big Fortune 500 companies, and even cyber security firms.

From the perspective of a threat intelligence analyst this attack teaches a vulnerble lesson in nation state cyber operations, supply chain security, and threat detection techniques. In this blog post I will discuss how the attack occurs, the key indicators of compromise (IoC), and what we can learn from this.


**-How the attack happened**  
The attack began with the SolarWinds Orion software, this software was a popular IT management platform used by large organizations worldwide. Below is a step-by-step breakdown of how the attackers executed their plan:

**1. The Initial Attack (September 2019 – February 2020)**  
Attackers who were later identified as APT29 (Cozy Bear), a Russian nation-state hacking group, gained access to SolarWinds’ development environment in which they inserted malicious code into legitimate software updates for the Orion software known as the Sunburst backdoor.

**2. Chain Infection (March – June 2020)**  
Customers that downloaded and installed the infected Orion updates unknowingly provied APT29 attackers with backdoor access to their systems.
The malware remained dormant (inactive) for up to two weeks to avoid immediate detection to better implement their attack later on.

**3. The Espionage Stage (June – December 2020)**  
Once activated, Sunburst established communication with command-and-control servers, allowing attackers to steal data, create persistence (ensuring they can continue their malicious activities without having to re-attack the systems), and escalate privileges.
Highly targeted organizations such as U.S. government agencies, Microsoft, and the Fortune 500 companies were exploited so the attackers could gather intelligence over a long period of time.

**4. Discovery & Response (December 2020 – Present)**  
FireEye discovered the breach while internally investigating a security incident.
Governments and private security firms alike began dismantling the attack infrastructure and issuing patches to those affected. In response to the attacks the US sanctioned russia


**-The Indicators of Compromise (IoCs)**  
Threat intelligence teams quickly identified several IoCs to help organizations detect and mitigate the attack. The key IoCs included:

**Network & Behavioral Indicators**  
**Malicious Domains:**  
avsvmcloud[.]com (used for C2 communication).
deftsecurity[.]com (used for secondary staging).
**Unusual Network Traffic:**  
Orion Improvement Program (OIP) sending unexpected data to external IPs.

**File & System Indicators**  
**Malware Hashes:**  
b91ce2fa41029f6955bff20079468448 (Sunburst backdoor).
4f2eb62fa3c64095f2a7c79ecd19e978 (Teardrop malware).

**Suspicious Processes & Services:**  
SolarWinds.BusinessLayerHost.exe (used to execute malware).
Security teams used these IoCs to hunt for infected systems and neutralize threats.

**-How We Can Prevent Future Attacks**  
**1. Strengthen Supply Chain Security**  
Vet third-party vendors carefully.
Implement code integrity checks and software composition analysis.
**2. Improve Threat Hunting & Detection**  
Use MITRE ATT&CK TTP mapping to identify APT-style behaviors.
Monitor for unusual DNS and HTTP requests to rare external domains.
**3. Implement Zero Trust Security**  
Use least privilege access to limit damage from compromised accounts.
Implement network segmentation to isolate sensitive systems.


**–Final Thoughts**  
The SolarWinds attack was a large wake-up call for cybersecurity professionals. It highlighted the importance of supply chain security, proactive threat intelligence, and rapid response capabilities.

As a Threat Intelligence Analyst, studying attacks like these will help us better understand adversary tactics and improve cyber defenses. By learning from the past, we can prevent similar threats in the future.

You can read the offical CISA report here:
[CISA Alert AA20-352](https://www.cisa.gov/news-events/cybersecurity-advisories/aa20-352a)

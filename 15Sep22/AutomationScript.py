import re


def getEmail(text):
    regex_out = []
    emails = re.findall("[a-zA-Z0-9._-]+@[a-zA-Z0-9]+\.[a-zA-Z]{2,}", text)
    for email in emails:
        regex_out.append(email)
    return ",".join(regex_out)


def getPhone(text):
    regex_out = []
    emails = re.findall(
        "[0-9]+", text)
    for email in emails:
        regex_out.append(email)
    print(regex_out)
    return ",".join(regex_out)

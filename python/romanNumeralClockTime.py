roman = {
    '1': 'I',
    '2': 'II',
    '3': 'III',
    '4': 'IV',
    '5': 'V',
    '6': 'VI',
    '7': 'VII',
    '8': 'VIII',
    '9': 'IX',
    '10': 'X',
    '11': 'XI',
    '12': 'XII',
    '13': 'XIII',
    '14': 'XIV',
    '15': 'XVI',
    '16': 'XVII',
    '17': 'XVIII',
    '18': 'XVIIII',
    '19': 'XIX',
    '20': 'XX',
    '21': 'XXI',
    '22': 'XXII',
    '23': 'XXIII',
    '24': 'XXIV',
    '25': 'XXV',
    '26': 'XXVI',
    '27': 'XXVII',
    '28': 'XXVIII',
    '29': 'XXIX',
    '30': 'XXX',
    '31': 'XXXI',
    '32': 'XXXII',
    '33': 'XXXIII',
    '34': 'XXXIV',
    '35': 'XXXV',
    '36': 'XXXVI',
    '37': 'XXXVII',
    '38': 'XXXVIII',
    '39': 'XXXIX',
    '40': 'XXXX',
    '41': 'XXXXI',
    '42': 'XXXXII',
    '43': 'XXXXIII',
    '44': 'XXXXIV',
    '45': 'XXXXV',
    '46': 'XXXXVI',
    '47': 'XXXXVII',
    '48': 'XXXXVIII',
    '49': 'XXXXIX',
    '50': 'L',
    '51': 'LI',
    '52': 'LII',
    '53': 'LIII',
    '54': 'LIV',
    '55': 'LV',
    '56': 'LVI',
    '57': 'LVII',
    '58': 'LVIII',
    '59': 'LIX'
}

def main():
    hour = input('Enter Hour: ')
    minute = input('Enter Minute: ')
    print(roman[hour] + ':' + roman[minute])

def convertRoman(hour, minute, roman):
    romanHour = ""
    romanMinute = ""

    for digit in hour:
        romanHour = roman[digit]+romanHour

    for digit in minute:
        romanMinute = roman[digit]+romanMinute

    romanTime = romanHour + ":" + romanMinute
    return romanTime

if __name__ == '__main__':
    main()
import calendar

def is_leap(year):
    leap = False
    if(year%400 == 0) and (year%100 == 0):
        leap = True
    elif(year%4==0) and (year%100 != 0):
        leap = True
    else:
        leap = False
    if leap:
        print("Leap Year")
        return leap
    else:
        print('Not Leap Year')
        return leap

def month_name(month):
    # using month_name() to get month name 
    res = calendar.month_name[month]
    
    # printing result
    print(str(res))


def days_in_month(month, year):
    print(calendar.monthrange(year, month)[1])
    return calendar.monthrange(year, month)[1]

year = int(input())
month = int(input())
if __name__ == '__main__':
    is_leap(year)
    month_name(month)
    days_in_month(month,year)



from pyowm import OWM
owm_ru = OWM(language='ru')
owm = OWM('a194b450ea8e19d1985d78b49dfe760b')

city = input('Ваш город: ')


observation = owm.weather_at_place(city)
w = observation.get_weather()
temperature = w.get_temperature('celsius')['temp']
wind = w.get_wind()['speed']

print('В городе ' + city + ' cейчас температура: ' + str(temperature) + ' градусов C')
print('А также: ' + w.get_detailed_status())
print('Ветер: ' + str(wind) + ' М/с')
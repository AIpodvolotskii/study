import pyowm


owm = pyowm.OWM('a194b450ea8e19d1985d78b49dfe760b')  # You MUST provide a valid API key



sity = input('Какой ваш город: ')

observation = owm.weather_at_place(sity)
w = observation.get_weather()



# Weather details
w.get_wind()                  # {'speed': 4.6, 'deg': 330}
w.get_humidity()              # 87
w.get_temperature('celsius')  # {'temp_max': 10.5, 'temp': 9.7, 'temp_min': 9.0}


print (w + str(w.get_wind()))
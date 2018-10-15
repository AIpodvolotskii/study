import pyowm

owm = pyowm.OWM('a194b450ea8e19d1985d78b49dfe760b')  # You MUST provide a valid API key

observation = owm.weather_at_place('London,GB')
w = observation.get_weather()

print (w)